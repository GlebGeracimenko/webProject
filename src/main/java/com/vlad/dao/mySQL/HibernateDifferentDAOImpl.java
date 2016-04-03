package com.vlad.dao.mySQL;

import com.vlad.dao.DBDifferentDAO;
import com.vlad.dao.object.DBDifferent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

/**
 * Created by gleb on 03.04.16.
 */
@Repository
public class HibernateDifferentDAOImpl implements DBDifferentDAO {

    @Autowired
    private EntityManagerFactory factory;

    @Override
    public int save(DBDifferent dbDifferent) {
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        manager.persist(dbDifferent);
        transaction.commit();
        return dbDifferent.getId();
    }

    @Override
    public void delete(int id) {
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        DBDifferent dbDifferent = get(id);
        if (dbDifferent != null) {
            manager.remove(manager.contains(dbDifferent) ? dbDifferent : manager.merge(dbDifferent));
        }
        transaction.commit();
    }

    @Override
    public DBDifferent get(int id) {
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        DBDifferent dbDifferent = manager.find(DBDifferent.class, id);
        transaction.commit();
        return dbDifferent;
    }
}

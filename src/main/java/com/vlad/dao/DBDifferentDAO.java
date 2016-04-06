package com.vlad.dao;

import com.vlad.model.DBDifferent;

import java.util.List;

/**
 * Created by gleb on 03.04.16.
 */
public interface DBDifferentDAO {

    int save(DBDifferent dbDifferent);

    void delete(int id);

    DBDifferent get(int id);

    List<DBDifferent> getAll();

}

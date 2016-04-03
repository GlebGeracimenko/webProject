package com.vlad.dao;

import com.vlad.dao.object.DBDifferent;

/**
 * Created by gleb on 03.04.16.
 */
public interface DBDifferentDAO {

    int save(DBDifferent dbDifferent);

    void delete(int id);

    DBDifferent get(int id);

}

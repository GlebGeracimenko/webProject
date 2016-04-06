package com.vlad.dao;

import static org.hamcrest.CoreMatchers.equalTo;

import com.vlad.model.DBDifferent;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.UUID;

/**
 * Created by gleb on 03.04.16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:test_application.xml"})
public class HibernateDifferentDAOImplTest {

    @Autowired
    private DBDifferentDAO differentDAO;

    @Test
    public void test() {
        DBDifferent different = new DBDifferent();
        different.setName(UUID.randomUUID().toString());
        differentDAO.save(different);

        DBDifferent different1 = differentDAO.get(different.getId());
        Assert.assertThat(different.getId(), equalTo(different1.getId()));
        Assert.assertThat(different.getName(), equalTo(different1.getName()));

        differentDAO.delete(different.getId());
        DBDifferent different2 = differentDAO.get(different.getId());
        Assert.assertNull(different2);

        List<DBDifferent> list = differentDAO.getAll();
        Assert.assertEquals(5, list.size());

    }

}

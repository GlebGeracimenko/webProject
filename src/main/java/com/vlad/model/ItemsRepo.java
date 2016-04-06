package com.vlad.model;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by gleb on 03.04.16.
 */
@Component
public class ItemsRepo {

    private List<DBDifferent> differentList;

    public List<DBDifferent> getDifferentList() {
        return differentList;
    }

    public void setDifferentList(List<DBDifferent> differentList) {
        this.differentList = differentList;
    }
}

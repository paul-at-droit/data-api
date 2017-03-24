package com.droit.datastore;

/**
 * Created by paul on 3/24/17.
 */
public interface Module extends NamespaceItem {

    Object getData();

    void setData(Object data);
}

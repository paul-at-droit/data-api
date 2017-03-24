package com.droit.datastore;

public class StringId implements ObjectID {

    private String id;

    public StringId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }
}

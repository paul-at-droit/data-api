package com.droit.datastore;

/**
 * The type String id.
 */
public class StringId implements ObjectID {

    private String id;

    /**
     * Instantiates a new String id.
     *
     * @param id the id
     */
    public StringId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }
}

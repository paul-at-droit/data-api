package com.droit.datastore;

/**
 * The interface Described object.
 */
public interface DescribedObject {

    /**
     * Data object.
     *
     * @return the object
     */
    public Object data();

    /**
     * Meta data object.
     *
     * @return the object
     */
    public Object metaData();

    /**
     * Gets version.
     *
     * @return the version
     */
    CommitID getVersion();
}

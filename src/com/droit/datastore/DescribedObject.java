package com.droit.datastore;

/**
 * The interface Described object.
 */
public interface DescribedObject {

    /**
     * The ID of this DescribedObject.
     *
     * @return the ID
     */
    ObjectID getID();

    /**
     * The stored data.
     *
     * @return the object
     */
    public Object getData();

    /**
     * The metadata associated with the data.
     *
     * @return the object
     */
    public Object getMetaData();

    /**
     * The version ID of the data.
     *
     * @return the version
     */
    CommitID getVersion();
}

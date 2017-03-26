package com.droit.datastore;

/**
 * Created by paul on 3/24/17.
 */
public interface DataStore {

    /**
     * Open the datastore for a specific user. It must have been created with all the information necessary for this.
     * @throws DataStoreException the data store exception
     */
    void open(UserID user) throws DataStoreException;

    /**
     * Create a described object with empty data and return it.
     *
     * @param id the id
     * @return the described object
     * @throws DataStoreException the data store exception
     */
    DescribedObject create(ObjectID id) throws DataStoreException;

    /**
     * Read an object by ID.
     *
     * @param id the id
     * @return the described object
     * @throws DataStoreException the data store exception
     */
    DescribedObject read(ObjectID id) throws DataStoreException;

    /**
     * Read a specific version of an object.
     *
     * @param id      the id
     * @param version the version
     * @return the described object
     * @throws DataStoreException the data store exception
     */
    DescribedObject read(ObjectID id, CommitID version) throws DataStoreException;

    /**
     * Save an object. This does not version it, but saves a persistent copy to the local workspace.
     *
     * @param obj the obj
     * @param id  the id
     * @throws DataStoreException the data store exception
     */
    void save(DescribedObject obj,ObjectID id) throws DataStoreException;

    /**
     * Check out an object. This creates a local workspace for editing the object, and prevents
     * any other user from checking it out. It will fail if the object is already checked out by another
     * user
     *
     * @param user the user
     * @param id   the id
     * @return the described object
     * @throws DataStoreException the data store exception
     */
    DescribedObject checkOut(ObjectID user,ObjectID id) throws DataStoreException;

    /**
     * Check in an object. This commits the object to the store from the workspace making it public.
     * The commit ID of the commit is returned
     *
     * @param id the id
     * @return the commit id
     * @throws DataStoreException the data store exception
     */
    CommitID checkIn(ObjectID id) throws DataStoreException;

    /**
     * Tag the current commit with a String tag.
     *
     * @param tag the tag
     * @return the version tag
     * @throws DataStoreException the data store exception
     */
    String tag(String tag) throws DataStoreException;

    /**
     * Delete an object. The object must have been checked out.
     *
     * @param id the id
     * @throws DataStoreException the data store exception
     */
    void delete(ObjectID id) throws DataStoreException;

}
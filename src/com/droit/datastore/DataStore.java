package com.droit.datastore;

/**
 * Created by paul on 3/24/17.
 */
public interface DataStore {

    /**
     * Open.
     *
     * @throws DataStoreException the data store exception
     */
    void open() throws DataStoreException;

    /**
     * Create described object.
     *
     * @param id the id
     * @return the described object
     * @throws DataStoreException the data store exception
     */
    DescribedObject create(ObjectID id) throws DataStoreException;

    /**
     * Read described object.
     *
     * @param id the id
     * @return the described object
     * @throws DataStoreException the data store exception
     */
    DescribedObject read(ObjectID id) throws DataStoreException;

    /**
     * Read described object.
     *
     * @param id      the id
     * @param version the version
     * @return the described object
     * @throws DataStoreException the data store exception
     */
    DescribedObject read(ObjectID id, CommitID version) throws DataStoreException;

    /**
     * Save.
     *
     * @param obj the obj
     * @param id  the id
     * @throws DataStoreException the data store exception
     */
    void save(DescribedObject obj,ObjectID id) throws DataStoreException;

    /**
     * Check out described object.
     *
     * @param user the user
     * @param id   the id
     * @return the described object
     * @throws DataStoreException the data store exception
     */
    DescribedObject checkOut(ObjectID user,ObjectID id) throws DataStoreException;

    /**
     * Check in commit id.
     *
     * @param id the id
     * @return the commit id
     * @throws DataStoreException the data store exception
     */
    CommitID checkIn(ObjectID id) throws DataStoreException;

    /**
     * Tag version tag.
     *
     * @param tag the tag
     * @return the version tag
     * @throws DataStoreException the data store exception
     */
    VersionTag tag(VersionTag tag) throws DataStoreException;

    /**
     * Delete.
     *
     * @param id the id
     * @throws DataStoreException the data store exception
     */
    void delete(ObjectID id) throws DataStoreException;

}

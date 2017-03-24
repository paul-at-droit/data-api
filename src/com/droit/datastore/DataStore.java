package com.droit.datastore;

/**
 * Created by paul on 3/24/17.
 */
public interface DataStore {

    void open() throws DataStoreException;

    DescribedObject create(ObjectID id) throws DataStoreException;

    DescribedObject read(ObjectID id) throws DataStoreException;

    DescribedObject read(ObjectID id, CommitID version) throws DataStoreException;

    void save(DescribedObject obj,ObjectID id) throws DataStoreException;

    DescribedObject checkOut(ObjectID user,ObjectID id) throws DataStoreException;

    CommitID checkIn(ObjectID id) throws DataStoreException;

    VersionTag tag(VersionTag tag) throws DataStoreException;

    void delete(ObjectID id) throws DataStoreException;

}

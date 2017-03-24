package com.droit.datastore;

public interface DescribedObject {

    public Object data();

    public Object metaData();

    CommitID getVersion();
}

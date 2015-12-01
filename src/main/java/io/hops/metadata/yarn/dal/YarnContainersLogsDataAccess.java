/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.hops.metadata.yarn.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;
import io.hops.metadata.yarn.entity.YarnContainersLogs;
import java.util.Collection;
import java.util.Map;

/**
 *
 * @author rizvi
 * @param <T>
 */
public interface YarnContainersLogsDataAccess<T> extends EntityDataAccess{

    //T findEntry(String containerId) throws StorageException;

    Map<String, YarnContainersLogs> getAll() throws StorageException;

    void addAll(Collection<T> YarnContainersLogs) throws StorageException;
    
    void removeAll(Collection<YarnContainersLogs> toBeRemoved_YarnContainersLogs) throws StorageException;
    
}

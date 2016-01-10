/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.hops.metadata.yarn.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;
import io.hops.metadata.yarn.entity.YarnProjectsDailyCost;
import io.hops.metadata.yarn.entity.YarnProjectsDailyId;
import java.util.Collection;
import java.util.Map;

/**
 *
 * @author rizvi
 */
public interface YarnProjectsDailyCostDataAccess<T> extends EntityDataAccess{
    
    //T findEntry(String projectId) throws StorageException;

    Map<YarnProjectsDailyId, YarnProjectsDailyCost> getAll() throws StorageException;

    void addAll(Collection<T> YarnProjectsDailyCost) throws StorageException;
    
}

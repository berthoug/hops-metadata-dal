/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.hops.metadata.yarn.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;
import java.util.Collection;
import java.util.Map;

/**
 * 
 * @author rizvi
 */
public interface YarnApplicationsToKillDataAccess<T> extends EntityDataAccess {
    
  //T findEntry(String projectId) throws StorageException;

  Map<String, T> getAll() throws StorageException;

  void addAll(Collection<T> YarnApplicationsListToKill) throws StorageException;
    
}
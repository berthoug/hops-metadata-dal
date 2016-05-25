/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.hops.metadata.yarn.entity;

/**
 *
 * @author rizvi
 */
public class YarnApplicationsQuota {
    
  private final String applicationId;
  private final long timeUsed;
  private final float budgetUsed;

  public YarnApplicationsQuota(String applicationId, long timeUsed,
          float budgetUsed) {
    this.applicationId = applicationId;
    this.timeUsed= timeUsed;
    this.budgetUsed = budgetUsed;
  }
  
  public YarnApplicationsQuota(String applicationId) {
    this(applicationId, 0l, 0.0f);
  }

    public String getApplicationId() {
        return applicationId;
    }

    public long getTimeUsed() {
        return timeUsed;
    }

    public float getBudgetUsed() {
        return budgetUsed;
    }
    
}

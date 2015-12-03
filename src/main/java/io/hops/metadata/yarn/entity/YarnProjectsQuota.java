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
public class YarnProjectsQuota {
    private final String projectid;
    private final int remaining_quota;
    private final int total_used_quota;
    
    public YarnProjectsQuota(String projectid, int remaining_quota,int total_used_quota) {
        this.projectid = projectid;
        this.remaining_quota = remaining_quota;
        this.total_used_quota = total_used_quota;
    }

    public String getProjectid() {
        return projectid;
    }

    public int getRemainingQuota() {
        return remaining_quota;
    }
    
    
    public int getTotalUsedQuota() {
        return total_used_quota;
    }
    
    @Override
    public String toString() {
        return "YarnProjectsQuota{" + "projectid=" + projectid + ", remaining_quota=" + remaining_quota  + ", total_used_quota=" + total_used_quota  + " }";
    }   
}

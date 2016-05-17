/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.hops.metadata.yarn.entity;

public class YarnApplicationsToKill {
    private final String applicationId;
    private final String rmnodeId;
    private final int pendingEventId;
    
    
    public YarnApplicationsToKill(int pendingEventId , String rmnodeid, String applicationId) {
        this.applicationId = applicationId;
        this.pendingEventId = pendingEventId;
        this.rmnodeId = rmnodeid;
    }    
    
    public YarnApplicationsToKill(String applicationId) {      
        this(-1, "killAppNodeId", applicationId);        
    }    


    public String getApplicationId() {
        return applicationId;
    }

    public int getPendingEventId() {
        return pendingEventId;
    }    

    public String getRmnodeId() {
        return rmnodeId;
    }
    
}

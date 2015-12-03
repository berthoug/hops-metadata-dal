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
public class YarnContainersLogs {

    private final String containerid;
    private final String state;    
    private final int start;
    private final int stop;
    
    public YarnContainersLogs(String containerid, String state, int start, int stop) {
        this.containerid = containerid;
        this.state = state;
        this.start = start;
        this.stop = stop;
    }

    public String getContainerid() {
        return containerid;
    }

    public String getState() {
        return state;
    }

    public int getStart() {
        return start;
    }

    public int getStop() {
        return stop;
    }
        
    @Override
    public String toString() {
        return "YarnContainersLog{" + "containerid=" + containerid + ", state=" + state + ", start=" + start + '}';
    }
      
    
    
}

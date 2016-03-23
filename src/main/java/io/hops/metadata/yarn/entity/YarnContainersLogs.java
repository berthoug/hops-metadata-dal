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
    private final int state;    
    private final long start;
    private final long stop;
    
    public YarnContainersLogs(String containerid, int state, long start, long stop) {
        this.containerid = containerid;
        this.state = state;
        this.start = start;
        this.stop = stop;
    }

    public String getContainerid() {
        return containerid;
    }

    public int getState() {
        return state;
    }

    public long getStart() {
        return start;
    }

    public long getStop() {
        return stop;
    }
        
    @Override
    public String toString() {
        return "YarnContainersLog{" + "containerid=" + containerid + ", state=" + state + ", start=" + start + '}';
    }
      
    
    
}

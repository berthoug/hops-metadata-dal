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
    private final String user;
    private final int start;
    private final int stop;
    private final int counted;

    public YarnContainersLogs(String containerid, String state, String user, int start, int stop, int counted) {
        this.containerid = containerid;
        this.state = state;
        this.user = user;
        this.start = start;
        this.stop = stop;
        this.counted = counted;
    }

    public String getContainerid() {
        return containerid;
    }

    public String getState() {
        return state;
    }

    public String getUser() {
        return user;
    }

    public int getStart() {
        return start;
    }

    public int getStop() {
        return stop;
    }
    
    public int getCounted() {
        return counted;
    }
    
    @Override
    public String toString() {
        return "YarnContainersLog{" + "containerid=" + containerid + ", state=" + state + ", user=" + user + ", start=" + start + ", counted=" + counted + '}';
    }
      
    
    
}

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
public class YarnProjectsDailyCost {
    private String projectName;
    private String projectUser;
    private long day;
    private int creditsUsed;
    
    public YarnProjectsDailyCost(String projectName, 
                                String projectUser,
                                long day,
                                int creditsUsed) {
        this.projectName = projectName;
        this.projectUser = projectUser;
        this.day = day;
        this.creditsUsed = creditsUsed;

    }
    
    @Override
    public String toString() {
        return "YarnProjectsQuota{" + "projectName=" + projectName + ", user=" + projectUser  + ", day=" + day  + ", credit=" + creditsUsed  + " }";
    }

    /**
     * @return the projectName
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * @return the projectUser
     */
    public String getProjectUser() {
        return projectUser;
    }

    /**
     * @return the day
     */
    public long getDay() {
        return day;
    }

    /**
     * @return the creditsUsed
     */
    public int getCreditsUsed() {
        return creditsUsed;
    }

    /**
     * @param projectName the projectName to set
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * @param projectUser the projectUser to set
     */
    public void setProjectUser(String projectUser) {
        this.projectUser = projectUser;
    }

    /**
     * @param day the day to set
     */
    public void setDay(long day) {
        this.day = day;
    }

    /**
     * @param creditsUsed the creditsUsed to set
     */
    public void setCreditsUsed(int creditsUsed) {
        this.creditsUsed = creditsUsed;
    }
    
    
    
}

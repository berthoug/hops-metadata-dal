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
    private final int credit;

    public YarnProjectsQuota(String projectid, int credit) {
        this.projectid = projectid;
        this.credit = credit;
    }

    public String getProjectid() {
        return projectid;
    }

    public int getCredit() {
        return credit;
    }

    @Override
    public String toString() {
        return "YarnProjectsQuota{" + "projectid=" + projectid + ", credit=" + credit  + " }";
    }   
}

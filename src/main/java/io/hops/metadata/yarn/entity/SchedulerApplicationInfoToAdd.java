/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.hops.metadata.yarn.entity;

public class SchedulerApplicationInfoToAdd {

  SchedulerApplication schedulerApplication;
  QueueMetrics queueMetrics;

  public SchedulerApplicationInfoToAdd(SchedulerApplication schedulerApplication,
          QueueMetrics queueMetrics) {
    this.schedulerApplication = schedulerApplication;
    this.queueMetrics = queueMetrics;
  }

  public SchedulerApplication getSchedulerApplication() {
    return schedulerApplication;
  }

  public QueueMetrics getQueueMetrics() {
    return queueMetrics;
  }

  
}

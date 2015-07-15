/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.hops.metadata.yarn.entity.rmstatestore;

public class RanNode {
  private final String applicationAttemptId;
  private final String nodeId;

  public RanNode(String applicationAttemptId, String nodeId) {
    this.applicationAttemptId = applicationAttemptId;
    this.nodeId = nodeId;
  }

  public String getApplicationAttemptId() {
    return applicationAttemptId;
  }

  public String getNodeId() {
    return nodeId;
  }
  
  
}

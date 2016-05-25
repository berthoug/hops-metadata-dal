/*
 * Copyright (C) 2015 hops.io.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.hops.metadata.yarn.entity;

public class ContainersLogs {

  private final String containerId;
  private final long start;
  private Long stop;
  private int exitStatus;
  private float price;

  public static final int DEFAULT_STOP_TIMESTAMP = 0;
  public static final int UNKNOWN_CONTAINER_EXIT = -200;
  public static final int CONTAINER_RUNNING_STATE = -201;

  public ContainersLogs(String containerId, long start,
          long stop, int exitStatus,float price) {
    this.containerId = containerId;
    this.start = start;
    this.stop = stop;
    this.exitStatus = exitStatus;
    this.price = price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public float getPrice() {
    return price;
  }
  
  public String getContainerid() {
    return containerId;
  }

  public long getStart() {
    return start;
  }

  public long getStop() {
    return stop;
  }

  public void setStop(long stop) {
    this.stop = stop;
  }

  public int getExitstatus() {
    return exitStatus;
  }

  public void setExitstatus(int exitstatus) {
    this.exitStatus = exitstatus;
  }
  
  @Override
  public String toString() {
    return "HopContainersLogs{" + "containerid=" + containerId
            + ", start=" + start + ", stop=" + stop + ", state" + exitStatus
            + '}';
  }

  @Override
  public int hashCode() {
    return this.containerId.hashCode() + 100 * this.exitStatus + 10000
            * this.stop.hashCode();
  }
  
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof ContainersLogs) {
      ContainersLogs other = (ContainersLogs) obj;
      if (other.containerId.equals(this.containerId) && other.exitStatus
              == this.exitStatus && other.stop.equals(this.stop)) {
        return true;
      }
    }
    return false;
  }
}

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
package io.hops.metadata.yarn.entity.rmstatestore;

import java.util.ArrayList;
import java.util.List;

public class AllocateResponse {

  private final String applicationattemptid;
  private final byte[] allocateResponse;
  private final List<String> allocatedContainers;
  public AllocateResponse(String applicationattemptid,
      byte[] allocateResponse, List<String> allocatedContainers) {
    this.applicationattemptid = applicationattemptid;
    this.allocateResponse = allocateResponse;
    if(allocatedContainers!=null){
      this.allocatedContainers = allocatedContainers;
    }else{
      this.allocatedContainers = new ArrayList<String>();
    }
  }

  public AllocateResponse(String applicationattemptid,  byte[] allocateResponse) {
    this(applicationattemptid, allocateResponse, null);
  }
    
  public AllocateResponse(String applicationattemptid) {
    this(applicationattemptid, null, null);
  }
  
  public String getApplicationattemptid() {
    return applicationattemptid;
  }

  public byte[] getAllocateResponse() {
    return allocateResponse;
  }

  public List<String> getAllocatedContainers() {
    return allocatedContainers;
  }
}

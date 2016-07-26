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

public class ApplicationState {

  private final String applicationId;
  private final byte[] appstate;
  private final String user;
  private final String name;
  private final String state;
  private final Long timeLimit;
  private final Float budgetLimit;
  private final Float priceLimit;
  private final String priceType;

  public ApplicationState(String applicationid) {
    this(applicationid, null, null, null, null, 0l, 0.0f, 0.0f,"");
  }

  public ApplicationState(String applicationid, byte[] appstate, String user,
          String name, String state) {
    this(applicationid, appstate, user, name, state, 0l, 0.0f, 0.0f, "");
  }

  public ApplicationState(String applicationId, byte[] appstate, String user,
          String name, String state, Long timeLimit, Float budgetLimit,
          Float priceLimit, String priceType) {
    this.applicationId = applicationId;
    this.appstate = appstate;
    this.name = name;
    this.user = user;
    this.state = state;
    this.timeLimit = timeLimit;
    this.budgetLimit = budgetLimit;
    this.priceLimit = priceLimit;
    this.priceType = priceType;
  }

  public String getApplicationid() {
    return this.applicationId;
  }

  public byte[] getAppstate() {
    return this.appstate;
  }

  public String getApplicationId() {
    return applicationId;
  }

  public String getUser() {
    return user;
  }

  public String getName() {
    return name;
  }

  public String getState() {
    return state;
  }

  public Long getTimeLimit() {
    return timeLimit;
  }

  public Float getBudgetLimit() {
    return budgetLimit;
  }

  public Float getPriceLimit() {
    return priceLimit;
  }
  
  public String getPriceType() {
    return priceType;
  }

  @Override
  public String toString() {
    String str = "HopApplicationState{" + "applicationid=" + applicationId;
    if (appstate != null) {
      str += ", appstate length=" + appstate.length;
    }
    str += '}';
    return str;
  }
}

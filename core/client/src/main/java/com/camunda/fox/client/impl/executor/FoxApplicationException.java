/**
 * Copyright (C) 2011, 2012 camunda services GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.camunda.fox.client.impl.executor;

import javax.ejb.ApplicationException;

/**
 * 
 * @author Daniel Meyer
 */
@ApplicationException // get past the EJB container
public class FoxApplicationException extends Exception {

  private static final long serialVersionUID = 1L;

  public FoxApplicationException(String message, Throwable cause) {
    super(message, cause);
  }

  public FoxApplicationException(String message) {
    super(message);
  }

}

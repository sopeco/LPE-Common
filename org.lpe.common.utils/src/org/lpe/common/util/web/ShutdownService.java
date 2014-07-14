/**
 * Copyright 2014 SAP AG
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.lpe.common.util.web;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * Initiates shutdown of the monitoring process.
 * 
 * @author Alexander Wert
 * 
 */
@Path("ShutdownService")
public class ShutdownService {
	/**
	 * Shuts down the server!
	 * 
	 */
	@POST
	@Path("shutdown")
	public void shutdown() {
		WebServer.getInstance().shutdown();
	}
}
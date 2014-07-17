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
package org.aim.api.measurement.sampling;

import org.aim.api.measurement.collector.IDataCollector;



/**
 * The {@link AbstractSampler} provides a common constructor for all recorder
 * classes. A recorder class is responsible for sampling a specific system
 * recource.
 * 
 * @author Alexander Wert
 * 
 */
public abstract class AbstractSampler implements ISampler {
	private IDataCollector dataCollector;



	/**
	 * Samples the underlying resource.
	 */
	public abstract void sample();

	/**
	 * @return the dataCollector
	 */
	public IDataCollector getDataCollector() {
		return dataCollector;
	}

	/**
	 * @param dataCollector
	 *            the dataCollector to set
	 */
	public void setDataCollector(IDataCollector dataCollector) {
		this.dataCollector = dataCollector;
	}

}

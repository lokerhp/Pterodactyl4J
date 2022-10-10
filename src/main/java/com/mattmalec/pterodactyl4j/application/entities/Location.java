/*
 *    Copyright 2021-2022 Matt Malec, and the Pterodactyl4J contributors
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.mattmalec.pterodactyl4j.application.entities;

import com.mattmalec.pterodactyl4j.PteroAction;
import com.mattmalec.pterodactyl4j.application.managers.LocationAction;
import java.util.List;

/**
 * Represents a Pterodactyl {@link com.mattmalec.pterodactyl4j.application.entities.Location Location}.
 * This should contain all information provided from the Pterodactyl instance about a Location.
 */
public interface Location extends ISnowflake {

	String getShortCode();

	String getDescription();

	PteroAction<List<Node>> getNodes();

	PteroAction<List<ApplicationServer>> getServers();

	LocationAction edit();

	PteroAction<Void> delete();
}

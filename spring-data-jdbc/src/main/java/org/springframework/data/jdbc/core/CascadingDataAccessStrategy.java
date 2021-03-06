/*
 * Copyright 2017-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.jdbc.core;

import java.util.List;

import org.springframework.data.jdbc.core.convert.DataAccessStrategy;

/**
 * Delegates each methods to the {@link DataAccessStrategy}s passed to the constructor in turn until the first that does
 * not throw an exception.
 *
 * @author Jens Schauder
 * @author Mark Paluch
 * @deprecated since 1.1, use {@link org.springframework.data.jdbc.core.convert.CascadingDataAccessStrategy}
 */
@Deprecated
public class CascadingDataAccessStrategy
		extends org.springframework.data.jdbc.core.convert.CascadingDataAccessStrategy {

	public CascadingDataAccessStrategy(List<DataAccessStrategy> strategies) {
		super(strategies);
	}

}

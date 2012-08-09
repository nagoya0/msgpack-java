/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package custom.beans;

import java.awt.Insets;
import custom.beans.DefaultPersistenceDelegate;
import custom.beans.Encoder;
import custom.beans.Expression;
import custom.beans.Statement;

class AwtInsetsPersistenceDelegate extends DefaultPersistenceDelegate {
    @Override
	@SuppressWarnings("boxing")
    protected Expression instantiate(Object oldInstance, Encoder enc) {
		Insets inset = (Insets) oldInstance;
		return new Expression(oldInstance, oldInstance.getClass(),
				Statement.CONSTRUCTOR_NAME, new Object[] { inset.top, inset.left, inset.bottom,
			 inset.right, });
	}
}

/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.comverse.testejb;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import junit.framework.TestCase;

public class HelloWorldTest extends TestCase {

	//START SNIPPET: setup	
	private InitialContext initialContext;

    protected void setUp() throws Exception {
        Properties properties = new Properties();
        properties.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.apache.openejb.client.LocalInitialContextFactory");

        initialContext = new InitialContext(properties);
    }
    //END SNIPPET: setup    

    /**
     * Lookup the Calculator bean via its remote home interface
     *
     * @throws Exception
     */
    //START SNIPPET: remote
    public void testHelloWorldViaRemoteInterface() throws Exception {
        Object object = initialContext.lookup("HelloWorldImplRemote");

		assertNotNull(object);
		assertTrue(object instanceof HelloWorldRemote);
		HelloWorldRemote hello = (HelloWorldRemote) object;
		assertEquals("Hello World!", hello.sayHello());
    }
    //END SNIPPET: remote
    
    /**
     * Lookup the Calculator bean via its local home interface
     *
     * @throws Exception
     */
    //START SNIPPET: local    
    public void testHelloWorldViaLocalInterface() throws Exception {
        Object object = initialContext.lookup("HelloWorldImplLocal");

		assertNotNull(object);
		assertTrue(object instanceof HelloWorldLocal);
		HelloWorldLocal hello = (HelloWorldLocal) object;
		assertEquals("Hello World!", hello.sayHello());
    }
    //END SNIPPET: local

}

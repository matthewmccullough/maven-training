package com.comverse.testejb;

import javax.ejb.Stateless;

/**
 * This is an EJB 3 style pojo stateless session bean
 * Every stateless session bean implementation must be annotated
 * using the annotation @Stateless
 * This EJB has 2 business interfaces: HelloWorldRemote, a remote business
 * interface, and HelloWorldLocal, a local business interface
 * 
 */
//START SNIPPET: code
@Stateless(mappedName = "HelloWorldImpl")
public class HelloWorldImpl implements HelloWorldRemote, HelloWorldLocal {

	public String sayHello() {
		return "Hello World!";
	}
}
//END SNIPPET: code
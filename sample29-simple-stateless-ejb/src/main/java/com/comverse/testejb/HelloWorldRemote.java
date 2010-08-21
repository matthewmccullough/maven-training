package com.comverse.testejb;

import javax.ejb.Remote;

/**
 * This is an EJB 3 remote business interface
 * A remote business interface must be annotated with the @Remote
 * annotation
 */
//START SNIPPET: code
@Remote
public interface HelloWorldRemote {
	
	public String sayHello();
}
//END SNIPPET: code

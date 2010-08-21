package com.comverse.testejb;

/**
 * This is an EJB 3 local business interface
 * A local business interface may be annotated with the @Local
 * annotation, but it's optional. A business interface which is 
 * not annotated with @Local or @Remote is assumed to be Local
 */
//START SNIPPET: code
public interface HelloWorldLocal {
	
	public String sayHello();
}
//END SNIPPET: code

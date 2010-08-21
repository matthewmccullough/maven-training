package com.comverse.testejb;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.Hashtable;

public class Test {
  public static void main (String[] args) throws Exception {
    System.out.println(args[0]);
    
    //System.out.println("weblogic.system.iiop.reconnectOnBootstrap==" + System.getProperty("weblogic.system.iiop.reconnectOnBootstrap"));
  
    //Loop 100 times making the EJB call
    //for (int i =0; i < 4; i++) {
      System.out.println("Starting the test fresh.");
      Test test = new Test();
      test.callEJB(args[0]);
      test = null;
      
//      System.out.println("Starting the test2 fresh.");
//      Test test2 = new Test();
//      test2.callEJB(args[1]);
//      test2 = null;
      
      System.out.println("After callEJB is out of scope. Sleeping a fe seconds.");
      Thread.sleep(5000);
    //}
  }
  
  
  public void callEJB(String serverURL) throws Exception {
    //System.setProperty("weblogic.RjvmIdleTimeout", "500");
  
    Hashtable env = new Hashtable(2);
    env.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
    //env.put(Context.PROVIDER_URL, "iiop://10.230.100.94:7001");//Matthew localhost 10.3
    //env.put(Context.PROVIDER_URL, "iiop://10.230.20.48:8001");//10.0 Yuri
    //env.put(Context.PROVIDER_URL, "iiop://drdsun23:9200");//10.3 dev
    //env.put(Context.PROVIDER_URL, "t3://drdsun23:8500");//10.0 dev
    //env.put(Context.PROVIDER_URL, "t3://10.230.100.159:7001");//10.3 Hansen SCORE
    env.put(Context.PROVIDER_URL, serverURL);
    
    //env.put(Context.INITIAL_CONTEXT_FACTORY, "com.ibm.websphere.naming.WsnInitialContextFactory");
    //env.put(Context.PROVIDER_URL, "corbaloc:iiop:10.230.100.143:4023");
    Context context = new InitialContext(env);
    
    System.out.println("Established InitialContext. Waiting a few seconds");
    Thread.sleep(1000);
    
    System.out.println("Looking up HelloWorld");
    //HelloWorldRemote helloWorld = (HelloWorldRemote)context.lookup("java:comp/env/ejb/HelloWorldRemote");
    //HelloWorldRemote helloWorld = (HelloWorldRemote)context.lookup("ejb/HelloWorldRemote");
    HelloWorldRemote helloWorld = (HelloWorldRemote)context.lookup("HelloWorldImpl#com.comverse.testejb.HelloWorldRemote");//Weblogic
    System.out.println("Finsihed looking up HelloWorld. Waiting a few seconds.");
    Thread.sleep(1000);
    
    //HelloWorldRemote helloWorld = (HelloWorldRemote)context.lookup("HelloWorldRemote");
    //HelloWorldRemote helloWorld = (HelloWorldRemote)context.lookup("HelloWorldImpl");//WebSphere
    //HelloWorldRemote helloWorld = (HelloWorldRemote)context.lookup("simple-stateless-1simple-stateless-1_1_jarHelloWorld_HelloWorldRemote");
    //HelloWorldRemote helloWorld =  PortableRemoteObject.narrow(context.lookup("simple-stateless-1simple-stateless-1_1_jarHelloWorld_HelloWorldRemote"), HelloWorldRemote);

	for (int i = 0; i < 1000; i++) {
    System.out.println("Called: " + helloWorld.sayHello() + " at " + (new java.util.Date()) + " and now waiting 10 seconds");
    Thread.sleep(1000);
    }
    
    context.close();
    context=null;
    System.out.println("Closed context. Now waiting a few seconds");
    Thread.sleep(1000);
  }
}
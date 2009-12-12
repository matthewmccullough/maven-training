package com.ambientideas;

//import com.ambientideas.GroovyUnitTestObject;
import junit.framework.TestCase;

public class JavaUnitTest extends TestCase
{
    public void testJavaUnitTestObject() {
        JavaUnitTestObject a = new JavaUnitTestObject();
        assertTrue(a.equals("DemoData"));
    }
    
    public void testGroovyUnitTestObject() {
        //GroovyUnitTestObject a = new GroovyUnitTestObject();
        //assertTrue(a.equals("DemoData"));
    }
}
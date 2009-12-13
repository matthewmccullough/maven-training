package com.ambientideas;

//import com.ambientideas.GroovyUnitTestObject;
import junit.framework.TestCase;

public class JavaUnitTest extends TestCase
{
    public void testJavaUnitTestObject() {
        JavaUnitTestObject a = new JavaUnitTestObject();
        assertTrue(a.attr.equals("DemoData"));
    }
    
    public void testGroovyUnitTestObject() {
        GroovyUnitTestObject a = new GroovyUnitTestObject();
        assertTrue(a.attr.equals("DemoData"));
    }
}
package com.ambientideas

import groovy.util.GroovyTestCase

//Causes compile to fail
//public class GroovyUnitTest extends TestCase
public class GroovyUnitTest extends GroovyTestCase
//public class GroovyUnitTest
{
    public void testJavaUnitTestObject()
    {
        JavaUnitTestObject a = new JavaUnitTestObject();
		assertTrue(a.attr.equals("DemoData"))
    }
}

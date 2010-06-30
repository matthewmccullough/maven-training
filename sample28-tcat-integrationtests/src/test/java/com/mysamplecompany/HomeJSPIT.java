package com.mysamplecompany;

import net.sourceforge.jwebunit.junit.WebTestCase;

public class HomeJSPIT extends WebTestCase {
	
    public void setUp() throws Exception {
        super.setUp();
        setBaseUrl("http://localhost:8080/");
    }

    public void testHomeJSPTitle() {
        beginAt("/sample28-jspwebapp-integrationtests");
        // clickLink("login");
        assertTitleEquals("A sample JSP");
        // setTextField("username", "test");
        // setTextField("password", "test123");
        // submit();
        // assertTitleEquals("Welcome, test!");
    }
}
package org.api.test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

@Test(groups = "baseURI")
public class SystemEnvironmentKeyAndTokenTest {

    @Test
    public void should_api_key() {
        assertTrue(System.getenv().get("trl_key").matches("^[a-zA-Z0-9]+$"));
    }

    @Test
    public void should_api_token() {
        assertTrue(System.getenv().get("trl_token").matches("^[a-zA-Z0-9]+$"));
    }
}
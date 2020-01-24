package org.api.test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

@Test(groups = "baseURI")
public class KeyTokenTest {

    @Test
    public void should_api_key() {
        assertTrue(System.getenv().get("trl_key").contains("239"));
    }

    @Test
    public void should_api_token() {
        assertTrue(System.getenv().get("trl_token").contains("875"));
    }
}
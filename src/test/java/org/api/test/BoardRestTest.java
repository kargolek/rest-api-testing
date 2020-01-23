package org.api.test;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class BoardRestTest {

    @BeforeMethod
    public void init() {
        RestAssured.baseURI = "https://api.trello.com/1/members/me";
    }

    @Test
    public void get_boards_200_content_json_body_name() {
        given()
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"))
        .when()
                .get("boards")
        .then()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .body("name", hasItems("Example_Name_Board"));
    }
}
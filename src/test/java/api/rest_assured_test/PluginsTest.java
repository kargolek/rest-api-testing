package api.rest_assured_test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PluginsTest {

    @BeforeMethod(groups = "set_baseURI")
    public void init() {
        System.out.println("ADD URI");
        RestAssured.baseURI = "https://api.trello.com/1";
    }
    //TODO Implement test scenario
    //@formatter:off
    @Test(groups = "set_baseURI", enabled = false)
    public void get_all_plugins() {
        given()
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"))
        .when()
                .log().all()
                .get("/plugins")
        .then()
                .statusLine("HTTP/1.1 200 OK")
                .statusCode(200)
                .contentType(ContentType.JSON)
                .log().all();
    }
    //@formatter:off

}

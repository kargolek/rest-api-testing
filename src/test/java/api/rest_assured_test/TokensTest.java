package api.rest_assured_test;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class TokensTest {

    private String badToken;

    @BeforeMethod()
    public void init(){
        badToken = System.getenv("trl_token").replace("8", "9");
        RestAssured.baseURI = "https://api.trello.com/1";
    }

    //@formatter:off
    @Test
    public void get_bad_token() {
        given()
                .queryParam("key", System.getenv("trl_key"))
        .when()
                .get(String.format("tokens/%s", badToken))
        .then()
                .statusCode(404)
                .contentType("text/plain; charset=utf-8")
                .body(is("token not found"));
    }

    @Test
    public void get_correct_token() {
        given()
                .queryParam("key", System.getenv("trl_key"))
        .when()
                .get(String.format("tokens/%s", System.getenv("trl_token")))
        .then()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .body("identifier", is("Server Token"));
    }
    //@formatter:on

}

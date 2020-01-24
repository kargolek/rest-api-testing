package org.api.test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;
import org.api.test.pojo.Board;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;;
import static org.hamcrest.Matchers.*;

public class BoardRestTest {

    private RequestSpecification requestSpecification;
    private Board board;

    @BeforeGroups(groups = "set_baseURI")
    public void init() {
        RestAssured.baseURI = "https://api.trello.com/1";
        System.out.println("Before baseURI");
    }

    @BeforeGroups(groups = "set_baseURI_create_board")
    public void get_boards_request() {
        RestAssured.baseURI = "https://api.trello.com/1";
        RequestSpecification requestSpecification = given()
                .contentType(ContentType.TEXT)
                .queryParam("", "?")
                .queryParam("name", "test_api_board_created")
                .queryParam("defaultLabels", "true")
                .queryParam("defaultLists", "true")
                .queryParam("desc", "test")
                .queryParam("keepFromSource", "none")
                .queryParam("prefs_permissionLevel", "private")
                .queryParam("prefs_voting", "disabled")
                .queryParam("prefs_comments", "members")
                .queryParam("prefs_invitations", "members")
                .queryParam("prefs_selfJoin", "true")
                .queryParam("prefs_cardCovers", "true")
                .queryParam("prefs_background", "green")
                .queryParam("prefs_cardAging", "regular")
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"));
        board = requestSpecification.request(Method.POST, "boards").as(Board.class);
    }

    /**
     * Perform http GET request to path "/boards" and validate response code 200, content-type: application/json
     * and body check name of first board equal to "Example_Name_Board"
     */
    @Test(groups = "set_baseURI")
    public void get_boards_200_content_json_body_name() {
        given()
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"))
                .when()
                .get("members/me/boards")
                .then()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .body("name", hasItems("Example_Name_Board"));
    }

    @Test(groups = "set_baseURI")
    public void post_board_name_test_api_board_created() {
        given()
                .contentType(ContentType.TEXT)
                .queryParam("", "?")
                .queryParam("name", "test_api_board_created")
                .queryParam("defaultLabels", "true")
                .queryParam("defaultLists", "true")
                .queryParam("desc", "test description")
                .queryParam("keepFromSource", "none")
                .queryParam("prefs_permissionLevel", "private")
                .queryParam("prefs_voting", "disabled")
                .queryParam("prefs_comments", "members")
                .queryParam("prefs_invitations", "members")
                .queryParam("prefs_selfJoin", "true")
                .queryParam("prefs_cardCovers", "true")
                .queryParam("prefs_background", "green")
                .queryParam("prefs_cardAging", "regular")
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"))
                .when()
                .post("boards")
                .then()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .body("name", is("test_api_board_created"))
                .body("desc", is("test description"));
    }

    @Test(groups = "set_baseURI_create_board")
    public void put_board_by_id_new_name() {
        given()
                .queryParam("name", "new_changed_name")
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"))
                .when()
                .put(String.format("boards/%s", board.getId()))
                .then()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .body("name", is("new_changed_name"));
    }


}


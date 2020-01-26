package api.test;

import api.actions.BoardActions;
import api.actions.CardActions;
import api.actions.ListActions;
import api.pojo.Board;
import api.pojo.Card;
import api.pojo.ListBoard;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class BoardRestTest {

    private final String baseGroup = "set_baseURI";
    private final String createBoardGroup = "set_baseURI_create_board";
    private final String removeBoardsAllGroup = "set_baseURI_remove_boards_all";

    private final String statusLine200 = "HTTP/1.1 200 OK";
    private String idVotingBoardPlugin = "55a5d917446f517774210013";
    private Board board;
    private BoardActions boardActions = new BoardActions();
    private ListActions listActions = new ListActions();
    private CardActions cardActions = new CardActions();

    @BeforeMethod(groups = baseGroup)
    public void init() {
        System.out.println("ADD URI");
        RestAssured.baseURI = "https://api.trello.com/1";
    }

    @BeforeMethod(groups = createBoardGroup)
    public void post_board_request() {
        System.out.println("CREATE BOARDS");
        board = boardActions.createBoard();
        List<ListBoard> listList = boardActions.getBoardLists(board.getId());
        Card card = cardActions.createCard("NEW_TEST_CARD", listList.get(0).getId());
    }

    @BeforeMethod(groups = removeBoardsAllGroup)
    public void initBaseURI_removeBoardsAll() {
        System.out.println("REMOVE ALL BOARDS");
        RestAssured.baseURI = "https://api.trello.com/1";
        boardActions.removeBoardsAll();
    }

    /**
     * Perform http GET request to path "/boards" and validate response code 200, content-type: application/json
     * and body check name of first board equal to "Example_Name_Board"
     */
    //@formatter:off
    @Test(groups = createBoardGroup)
    public void get_boards_200_content_json_body_name() {
        given()
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"))
        .when()
                .log().all()
                .get("/members/me/boards")
        .then()
                .log().all()
                .statusCode(200)
                .statusLine(statusLine200)
                .contentType("application/json; charset=utf-8")
                .body("name", hasItems("test_api_board_created"));
    }
    //@formatter:on
    //@formatter:off
    @Test(groups = removeBoardsAllGroup)
    public void get_boards_200_content_json_body_name_boards_empty() {
        given()
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"))
        .when()
                .log().all()
                .get("members/me/boards")
        .then()
                .log().all()
                .statusCode(200)
                .statusLine(statusLine200)
                .contentType(ContentType.JSON)
                .body("id", empty());
    }
    //@formatter:on
    //@formatter:off
    @Test(groups = createBoardGroup)
    public void put_board_by_id_new_name() {
        given()
                .queryParam("name", "new_changed_name")
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"))
        .when()
                .log().all()
                .put(String.format("boards/%s", board.getId()))
        .then()
                .log().all()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .body("name", is("new_changed_name"));
    }
    //@formatter:on
    //@formatter:off
    @Test(groups = createBoardGroup)
    public void put_board_by_id_new_name_error_id() {
        RestAssured.registerParser("text/plain", Parser.TEXT);
        given()
                .queryParam("name", "new_changed_name")
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"))
        .when()
                .log().all()
                .put(String.format("boards/%s", "anErrorId"))
        .then()
                .log().all()
                .statusCode(400)
                .contentType("text/plain; charset=utf-8")
                .body(is("invalid id"));
    }
    //@formatter:on
    //@formatter:off
    @Test(groups = createBoardGroup)
    public void get_boards_receive_field() {
        given()
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"))
        .when()
                .log().all()
                .get(String.format("boards/%s/name", board.getId()))
        .then()
                .log().all()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .body("_value", is("test_api_board_created"));
    }
    //@formatter:on
    //@formatter:off
    @Test(groups = createBoardGroup)
    public void get_boards_actions_limited_1() {
        given()
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"))
        .when()
                .log().all()
                .get(String.format("boards/%s/actions/?limited=1", board.getId()))
        .then()
                .log().all()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .body("id", notNullValue());
    }
    //@formatter:on

    //@formatter:off
    @Test(groups = createBoardGroup)
    public void get_board_plugins() {
        given()
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"))
        .when()
                .log().all()
                .get("/boards/" + board.getId() + "/boardPlugins")
        .then()
                .log().all()
                .statusLine(statusLine200)
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("id", hasItem(board.getId()))
                .body("idBoard", hasItem(board.getId()))
                .body("idPlugin", anything());
    }
    //@formatter:on

    //@formatter:off
    @Test(groups = createBoardGroup)
    public void get_board_plugins_error_board_id() {
        given()
                .param("fields", "id")
                .param("boardStars", "mine")
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"))
        .when()
                .log().all()
                .get("/boards/" + board.getId())
        .then()
                .log().all()
                .statusLine(statusLine200)
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("id", is(board.getId()))
                .body("boardStars", empty());
    }
    //@formatter:on
    //@formatter:off
    @Test(groups = createBoardGroup)
    public void get_board_cards_limit_one() {
        given()
                .param("limit", "2")
                .param("fields", "name")
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"))
        .when()
                .log().all()
                .get("/boards/" + board.getId() + "/cards/")
        .then()
                .log().all()
                .statusLine(statusLine200)
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("id", anything())
                .body("name", hasItem("NEW_TEST_CARD"));
    }
    //@formatter:on
    //@formatter:off
    @Test(groups = createBoardGroup)
    public void post_board_plugin_enable_plugin() {
        given()
                .contentType(ContentType.TEXT)
                .queryParam("idPlugin", idVotingBoardPlugin)
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"))
        .when()
                .log().all()
                .post("/boards/" + board.getId() +"/boardPlugins")
        .then()
                .log().all()
                .statusLine(statusLine200)
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("idPlugin", is(idVotingBoardPlugin))
                .body("idBoard", is(board.getId()));
    }
    //@formatter:on
    //@formatter:off
    @Test(groups = baseGroup)
    public void post_board_name_test_api_board_created() {
        given()
                .contentType(ContentType.TEXT)
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
                .log().all()
                .post("/boards")
        .then()
                .log().all()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .body("name", is("test_api_board_created"))
                .body("desc", is("test description"));
    }
    //@formatter:on

    //@formatter:off
    @Test(groups = baseGroup)
    public void post_board_name_test_api_board_created_error_body() {
        RestAssured.registerParser("text/plain", Parser.TEXT);
        given()
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
                .log().all()
                .post("/boards")
        .then()
                .log().all()
                .statusCode(415)
                .contentType("text/plain; charset=utf-8")
                .body(is("Error parsing body"));
    }
    //@formatter:on

    //@formatter:off
    @Test(groups = createBoardGroup)
    public void post_board_plugin_enable_plugin_error_plugin_id_incorrect() {
        RestAssured.registerParser("text/plain", Parser.TEXT);
        given()
                .contentType(ContentType.TEXT)
                .queryParam("idPlugin", idVotingBoardPlugin.replaceAll("5", "0"))
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"))
        .when()
                .log().all()
                .post("/boards/" + board.getId() + "/boardPlugins")
        .then()
                .log().all()
                .statusLine("HTTP/1.1 404 Not Found")
                .statusCode(404)
                .contentType(ContentType.TEXT)
                .body(is("Plugin not found"));
    }
    //@formatter:on

    //@formatter:off
    @Test(groups = createBoardGroup)
    public void post_board_plugin_enable_plugin_error_reach_plugins_limit() {
        given()
                .contentType(ContentType.TEXT)
                .queryParam("idPlugin", idVotingBoardPlugin)
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"))
        .when()
                .log().all()
                .post("/boards/" + board.getId() + "/boardPlugins");
        given()
                .contentType(ContentType.TEXT)
                .queryParam("idPlugin", idVotingBoardPlugin)
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"))
        .when()
                .log().all()
                .post("/boards/" + board.getId() + "/boardPlugins")
        .then()
                .log().all()
                .statusLine("HTTP/1.1 409 Conflict")
                .statusCode(409)
                .contentType(ContentType.JSON)
                .body("message", is("Can't enable plugin"))
                .body("error", is("PLUGIN_TOO_MANY_PLUGINS"));
    }
    //@formatter:off:


}


package api.actions;

import api.pojo.board.Board;
import api.pojo.board.MyPrefs;
import api.pojo.lists.BoardList;
import api.pojo.membership.Membership;
import api.pojo.search.FoundMember;
import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class BoardActions {

    public void removeBoardsAll() {
        for (Map<String, Object> boardMap : getBoardsData()) {
            removeBoardsDataAll((String) boardMap.get("id"));
        }
    }

    public Board createBoard() {
        RestAssured.baseURI = "https://api.trello.com/1";
        RequestSpecification requestSpecification = given()
                .contentType(ContentType.TEXT)
                .queryParam("", "?")
                .queryParam("name", RandomStringUtils.randomAlphabetic(10))
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
                .queryParam("token", System.getenv("trl_token"));
        Response response = requestSpecification.request(Method.POST, "boards");
        response.then().log().all();
        return response.as(Board.class);
    }

    public Board createBoard(String boardName) {
        RestAssured.baseURI = "https://api.trello.com/1";
        RequestSpecification requestSpecification = given()
                .contentType(ContentType.TEXT)
                .queryParam("", "?")
                .queryParam("name", boardName)
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
                .queryParam("token", System.getenv("trl_token"));
        return requestSpecification.request(Method.POST, "boards").as(Board.class);
    }

    public List<BoardList> getBoardLists(String idBoard) {
        RestAssured.baseURI = "https://api.trello.com/1";
        RequestSpecification requestSpecification = given()
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"));
        return requestSpecification.request(Method.GET, "/boards/" + idBoard + "/lists").as(new TypeRef<List<BoardList>>() {
        });
    }

    private List<Map<String, Object>> getBoardsData() {
        RestAssured.baseURI = "https://api.trello.com/1";
        return RestAssured
                .given()
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"))
                .get("/members/me/boards").as(new TypeRef<List<Map<String, Object>>>() {
                });
    }

    private void removeBoardsDataAll(String id) {
        RestAssured.baseURI = "https://api.trello.com/1";
        RestAssured
                .given()
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"))
                .delete("/boards/" + id);
    }

    public List<Membership> getBoardMemberships(String idBoard) {
        RestAssured.baseURI = "https://api.trello.com/1";
        RequestSpecification requestSpecification = given()
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"));
        return requestSpecification.request(Method.GET, "/boards/" + idBoard + "/memberships").as(new TypeRef<List<Membership>>() {
        });
    }

    public void setMemberInBoard(String idBoard, String username, String type) {
        RestAssured.baseURI = "https://api.trello.com/1";
        FoundMember member = new SearchActions().getMemberByUserName(username).get(0);
        RequestSpecification requestSpecification = given()
                .queryParam("type", type)
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"));
        requestSpecification.request(Method.PUT, "/boards/" + idBoard + "/members/" + member.getId());
    }

    public Board generateEmailKeyBoard(String idBoard) {
        RestAssured.baseURI = "https://api.trello.com/1";
        RequestSpecification requestSpecification = given()
                .contentType(ContentType.TEXT)
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"));
        Response response = requestSpecification.request(Method.POST, "/boards/" + idBoard + "/emailKey/generate");
        response.then().log().all();
        return response.as(Board.class);
    }

    public Board getBoardWithMyPrefs(String idBoard) {
        RestAssured.baseURI = "https://api.trello.com/1";
        RequestSpecification requestSpecification = given()
                .queryParam("myPrefs", true)
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"));
        Response response = requestSpecification.request(Method.GET, "/boards/" + idBoard);
        response.then().log().all();
        return response.as(Board.class);
    }

}

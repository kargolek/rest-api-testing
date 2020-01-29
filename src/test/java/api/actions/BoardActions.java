package api.actions;

import api.pojo.Board;
import api.pojo.lists.BoardList;
import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class BoardActions {

    public void removeBoardsAll(){
        for (Map<String, Object> boardMap : getBoardsData()){
            removeBoardsDataAll((String) boardMap.get("id"));
        }
    }

    public Board createBoard(){
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
        return requestSpecification.request(Method.POST, "boards").as(Board.class);
    }

    public Board createBoard(String boardName){
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

    public List<BoardList> getBoardLists(String idBoard){
        RestAssured.baseURI = "https://api.trello.com/1";
        RequestSpecification requestSpecification = given()
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"));
        return requestSpecification.request(Method.GET, "/boards/" + idBoard + "/lists").as(new TypeRef<List<BoardList>>(){});
    }

    private List<Map<String, Object>> getBoardsData(){
        RestAssured.baseURI = "https://api.trello.com/1";
        return RestAssured
                .given()
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"))
                .get("/members/me/boards").as(new TypeRef<List<Map<String, Object>>>() {});
    }

    private void removeBoardsDataAll(String id){
        RestAssured.baseURI = "https://api.trello.com/1";
        RestAssured
                .given()
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"))
                .delete("/boards/" + id);
    }

}

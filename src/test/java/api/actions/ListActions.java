package api.actions;

import api.pojo.Card;
import api.pojo.lists.BoardList;
import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class ListActions {

    public List<Card> getCards(String idList) {
        RestAssured.baseURI = "https://api.trello.com/1";
        RequestSpecification requestSpecification = given()
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"));
        return requestSpecification.request(Method.GET, "/list/" + idList + "/cards").as(new TypeRef<List<Card>>() {
        });
    }

    public BoardList getList(String idList) {
        RestAssured.baseURI = "https://api.trello.com/1";
        RequestSpecification requestSpecification = given()
                .queryParam("fields", System.getenv("all"))
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"));
        return requestSpecification.request(Method.GET, "/lists/" + idList).as(BoardList.class);
    }

    public void closedList(String idList) {
        RestAssured.baseURI = "https://api.trello.com/1";
        RequestSpecification requestSpecification = given()
                .contentType(ContentType.TEXT)
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"));
        requestSpecification.when().request(Method.PUT, "/lists/" + idList + "/closed?value=true").then().log().all();
    }


}

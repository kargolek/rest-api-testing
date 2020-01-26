package api.actions;

import api.pojo.Card;
import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ListActions {

    public List<Card> getCards(String idList){
        RestAssured.baseURI = "https://api.trello.com/1";
        RequestSpecification requestSpecification = given()
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"));
        return requestSpecification.request(Method.GET, "/list/" + idList + "/cards").as(new TypeRef<List<Card>>(){});
    }


}

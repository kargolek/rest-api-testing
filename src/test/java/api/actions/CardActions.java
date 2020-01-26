package api.actions;

import api.test.pojo.Card;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class CardActions {

    public Card createCard(String name, String idList){
        RestAssured.baseURI = "https://api.trello.com/1";
        RequestSpecification requestSpecification = given()
                .contentType(ContentType.TEXT)
                .queryParam("name", name)
                .queryParam("idList", idList)
                .queryParam("keepFromSource","all")
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"));
        return requestSpecification.request(Method.POST, "/cards/").as(Card.class);
    }

}

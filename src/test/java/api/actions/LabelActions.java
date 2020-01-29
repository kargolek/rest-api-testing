package api.actions;

import api.pojo.labels.Label;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class LabelActions {

    public Label createLabelOnBoard(String labelName, String labelColor, String idBoard){
        RestAssured.baseURI = "https://api.trello.com/1";
        RequestSpecification requestSpecification = given()
                .contentType(ContentType.TEXT)
                .queryParam("name", labelName)
                .queryParam("color", labelColor)
                .queryParam("idBoard", idBoard)
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"));
        return requestSpecification.request(Method.POST, "/labels").as(Label.class);
    }


}

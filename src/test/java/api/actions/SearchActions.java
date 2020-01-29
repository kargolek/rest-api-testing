package api.actions;

import api.pojo.search.FoundMember;
import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

import java.util.List;

import static io.restassured.RestAssured.given;

public class SearchActions {

    public List<FoundMember> getMemberByUserName(String userName){
        RestAssured.baseURI = "https://api.trello.com/1";
        RequestSpecification requestSpecification = given()
                .queryParam("query", userName)
                .queryParam("key", System.getenv().get("trl_key"))
                .queryParam("key", System.getenv().get("trl_token"));
        return requestSpecification.request(Method.GET, "/search/members/").as(new TypeRef<List<FoundMember>>(){});
    }


}

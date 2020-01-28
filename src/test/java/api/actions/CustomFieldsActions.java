package api.actions;

import api.cucumber_test.DataShared;
import api.pojo.custom_fields_body.CustomFieldBody;
import api.pojo.custom_fields_body.Option;
import api.pojo.custom_fields_body.Value;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.specification.RequestSpecification;

import java.util.Arrays;

import static io.restassured.RestAssured.given;

public class CustomFieldsActions {

    public void createCustomFieldDropDownList(String idBoard) {
        CustomFieldBody customFieldBody = new CustomFieldBody(idBoard, "board",
                "My dropdown list", Arrays.asList(new Option("none", new Value("First"), 1024),
                new Option("none", new Value("Second"), 2048)),
                "bottom", "list", true);
        RestAssured.baseURI = "https://api.trello.com/1";
        RequestSpecification requestSpecification = given()
                .contentType(ContentType.JSON)
                .body(customFieldBody, ObjectMapperType.JACKSON_2)
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"));
        requestSpecification.request(Method.POST, "/customFields");
    }
}

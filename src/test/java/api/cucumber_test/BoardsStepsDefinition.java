package api.cucumber_test;

import api.actions.BoardActions;
import api.pojo.Board;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class BoardsStepsDefinition {

    public Response response;
    public RequestSpecification request = given();
    public Board board;
    public String tempPath = "";

    @Given("Create one board name {string}")
    public void createBoard(String name){
        board = new BoardActions().createBoard(name);
    }

    @Given("Remove all boards")
    public void removeBoards(){
        new BoardActions().removeBoardsAll();
    }

    @Given("Register text plain parser")
    public void registerTextParser(){
        RestAssured.registerParser("text/plain", Parser.TEXT);
    }

    @Given("Set base URI {string}")
    public void setBaseURI(String arg0) {
        request.baseUri(arg0);
    }

    @Given("Set base path {string}")
    public void setBasePath(String arg0) {
        tempPath = tempPath + arg0;
    }

    @Given("Set base path board id")
    public void setBasePathBoardId() {
        tempPath = tempPath + "/" + board.getId();
    }

    @Given("Set key and token queries parameters")
    public void setKeyAndToken(){
        request.queryParam("key", System.getenv("trl_key"));
        request.queryParam("token", System.getenv("trl_token"));
    }

    @Given("Set query parameter {string} and value {string}")
    public void setQueriesParam(String arg0, String arg1) {
        request.queryParam(arg0, arg1);
    }

    @Given("Set parameter {string} and value {string}")
    public void setParam(String arg0, String arg1) {
        request.param(arg0, arg1);
    }

    @When("Send get request to endpoint {string}")
    public void sendRequest(String arg0) {
        response = request.log().all()
                .get(arg0);
        response.then().log().all();
    }

    @When("Send put request")
    public void sendPutRequest(){
        response = request.log().all()
                .put(tempPath);
        response.then().log().all();
    }

    @Then("Status line should be {string}")
    public void validateStatusLine(String arg0) {
        response.then().statusLine(arg0);
    }

    @Then("Status code should be {string}")
    public void validateResponseCode(String arg0) {
        response.then().statusCode(Integer.parseInt(arg0));
    }

    @Then("Content type should be {string}")
    public void validateContentType(String contentType){
        response.then().contentType(contentType);
    }

    @Then("Response body for key {string} is {string}")
    public void validateResponseBodyIsValue(String key, String value) {
        response.then().body(key, is(value));
    }

    @Then("Response body for key {string} equal to {string}")
    public void validateResponseBodyEqualToValue(String key, String value) {
        response.then().body(key, equalTo(value));
    }

    @Then("Response body for key {string} has item {string}")
    public void validateResponseBodyHasItemValue(String key, String value) {
        response.then().body(key, hasItem(value));
    }

    @Then("Response body text is {string}")
    public void validateResponseBodyIsText(String text){
        response.then().body(is(text));
    }

    @Then("Response body text {string} is empty")
    public void validateResponseBodyIsEmpty(String key){
        response.then().body(key, empty());
    }

}

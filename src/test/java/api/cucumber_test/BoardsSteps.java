package api.cucumber_test;

import api.actions.BoardActions;
import api.actions.CardActions;
import api.pojo.Board;
import api.pojo.Card;
import api.pojo.ListBoard;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import javax.xml.crypto.Data;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class BoardsSteps {

    public Response response;
    public RequestSpecification request = given();

    public DataShared dataShared = DataShared.getInstance();

    private BoardActions boardActions = new BoardActions();

    @Before("@RemoveAllBoards")
    public void removeBoards() {
        new BoardActions().removeBoardsAll();
    }

    @Before("@RegisterTextParser")
    public void registerTextParser() {
        RestAssured.registerParser("text/plain", Parser.TEXT);
    }

    @Before("@CreateBoard")
    public void createBoardRandomName() {
        dataShared.setBoard(boardActions.createBoard());
    }

    @Given("Create one board name {string}")
    public void createBoardGiveName(String name) {
        dataShared.setBoard(boardActions.createBoard(name));
    }

    @Given("Create one board name")
    public void createBoard() {
        dataShared.setBoard(boardActions.createBoard());
    }

    @Given("Set base URI {string}")
    public void setBaseURI(String arg0) {
        request.baseUri(arg0);
    }

    @Given("Set base path {string}")
    public void setBasePath(String path) {
        dataShared.addPathRequest(path);
    }

    @Given("Set base path board id")
    public void setBasePathBoardId() {
        dataShared.addPathRequest("/" + dataShared.getBoard().getId());
    }

    @Given("Set query parameter voting plugin id")
    public void setVotingPluginIdBasePath() {
        String idVotingBoardPlugin = "55a5d917446f517774210013";
        request.queryParam("idPlugin", idVotingBoardPlugin);
    }

    @Given("Set request content type text")
    public void setContentTypeText() {
        request.contentType(ContentType.TEXT);
    }

    @Given("Set key and token")
    public void setKeyAndToken() {
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
    public void sendGetRequestAndGiveArg(String arg0) {
        response = request.log().all()
                .get(arg0);
        response.then().log().all();
    }

    @When("Send get request")
    public void sendGetRequest() {
        response = request.log().all()
                .get(dataShared.getTempPathRequest());
        response.then().log().all();
    }

    @When("Send put request")
    public void sendPutTempRequest() {
        response = request.log().all()
                .put(dataShared.getTempPathRequest());
        response.then().log().all();
    }

    @When("Send post request")
    public void sendPostTempRequest() {
        response = request.log().all()
                .post(dataShared.getTempPathRequest());
        response.then().log().all();
    }

    @Then("Status line should be {string}")
    public void validateStatusLine(String arg0) {
        response.then().statusLine(arg0);
    }

    @Then("Status code should be {int}")
    public void validateResponseCode(int code) {
        response.then().statusCode(code);
    }

    @Then("Content type should be {string}")
    public void validateContentType(String contentType) {
        response.then().contentType(contentType);
    }

    @Then("Response body key {string} is {string}")
    public void validateResponseBodyIsValue(String key, String value) {
        response.then().body(key, is(value));
    }

    @Then("Response body key {string} equal to {string}")
    public void validateResponseBodyEqualToValue(String key, String value) {
        response.then().body(key, equalTo(value));
    }

    @Then("Response body key {string} has item {string}")
    public void validateResponseBodyHasItemValue(String key, String value) {
        response.then().body(key, hasItem(value));
    }

    @Then("Response body text is {string}")
    public void validateResponseBodyIsText(String text) {
        response.then().body(is(text));
    }

    @Then("Response body key {string} is not null")
    public void validateResponseBodyIsNotNull(String key) {
        response.then().body(key, notNullValue());
    }

    @Then("Response body key {string} has size {int}")
    public void validateResponseBodyIsNotNull(String key, int size) {
        response.then().body(key, hasSize(size));
    }

    @Then("Response body key {string} is empty")
    public void validateResponseBodyKeyIsEmpty(String key) {
        response.then().body(key, empty());
    }

}

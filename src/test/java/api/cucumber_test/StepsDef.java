package api.cucumber_test;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static org.hamcrest.Matchers.*;

public class StepsDef {

    static RequestSpecification request;
    Response response;

    private DataShared dataShared = DataShared.getInstance();

    @Before("@RegisterTextParser")
    public void registerTextParser() {
        RestAssured.registerParser("text/plain", Parser.TEXT);
    }

    @Given("Set request content type text")
    public void setContentTypeText() {
        request.contentType(ContentType.TEXT);
    }

    @Given("Set request content type json")
    public void setContentTypeJson() {
        request.contentType(ContentType.JSON);
    }

    @Given("Set base URI {string}")
    public void setBaseURI(String uri) {
        request.baseUri(uri);
    }

    @Given("Set base path {string}")
    public void setBasePath(String path) {
        dataShared.addPathRequest(path);
    }

    @Given("Set query parameter {string} and value {string}")
    public void setQueriesParam(String key, String value) {
        request.queryParam(key, value);
    }

    @Given("Set parameter {string} and value {string}")
    public void setParam(String key, String value) {
        request.param(key, value);
    }

    @Given("Set key and token")
    public void setKeyAndToken() {
        request.queryParam("key", System.getenv("trl_key"));
        request.queryParam("token", System.getenv("trl_token"));
    }

    @Given("Set request json body")
    public void setRequestBodyJson() {
        request.body(DataShared.getInstance().getPostObject(), ObjectMapperType.JACKSON_2);
    }

    @When("Send get request to endpoint {string}")
    public void sendGetRequestAndGiveArg(String endpoint) {
        response = request.log().all()
                .get(endpoint);
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

    @Then("Response body key {string} is boolean {string}")
    public void validateResponseBodyIsNotNull(String key, String value) {
        response.then().body(key, is(Boolean.parseBoolean(value)));
    }


}

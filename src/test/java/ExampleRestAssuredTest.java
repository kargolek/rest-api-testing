import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ExampleRestAssuredTest {

    @Test
    public void firstHandshakeWithRestAssured() {
        RestAssured.baseURI = "https://api.trello.com/1/members/me/boards?actions=all";
        Response response = RestAssured
                .given()
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"))
                .get();

        Assert.assertEquals(200, response.getStatusCode());
    }

    @Test
    public void secondHandshakeWithRestAssured() {
        RestAssured.baseURI = "https://api.trello.com/1/members/me/boards?actions=all";
        Response response = RestAssured
                .given()
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"))
                .get();

        Assert.assertEquals(200, response.getStatusCode());
        Assert.assertEquals("application/json; charset=utf-8", response.getHeader("Content-Type"));
    }

    @Test
    public void thirdHandshakeWithRestAssured() {
        RestAssured.baseURI = "https://api.trello.com/1/members/me/boards?actions=all";
        Response response = RestAssured
                .given()
                .queryParam("key", System.getenv("trl_key"))
                .queryParam("token", System.getenv("trl_token"))
                .get();

        Assert.assertEquals("Example_Name_Board", response.body()
                .peek()
                .jsonPath()
                .getList("name")
                .get(0));
    }
}

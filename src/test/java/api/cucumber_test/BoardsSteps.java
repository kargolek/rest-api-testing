package api.cucumber_test;

import api.actions.BoardActions;
import api.actions.CardActions;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

import static io.restassured.RestAssured.given;

public class BoardsSteps {

    DataShared dataShared = DataShared.getInstance();
    private BoardActions boardActions = new BoardActions();

    @Before("@RemoveAllBoards")
    public void removeBoards() {
        new BoardActions().removeBoardsAll();
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

    @Given("Set base path board id")
    public void setBasePathBoardId() {
        dataShared.addPathRequest("/" + dataShared.getBoard().getId());
    }

    @Given("Set query parameter voting plugin id")
    public void setVotingPluginIdBasePath() {
        String idVotingBoardPlugin = "55a5d917446f517774210013";
        StepsDef.request.queryParam("idPlugin", idVotingBoardPlugin);
    }
}

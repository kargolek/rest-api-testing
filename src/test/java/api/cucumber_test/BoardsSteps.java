package api.cucumber_test;

import api.actions.BoardActions;
import api.pojo.board.Board;
import api.pojo.membership.Membership;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

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

    @Given("Set base path found member id")
    public void setFoundMemberIdBasePath() {
        dataShared.addPathRequest("/" + dataShared.getFoundMember().getId());
    }

    @Given("Set base path membership id: requested index {int}")
    public void setMembershipIdBasePath(int index) {
        Membership membership = boardActions.getBoardMemberships(dataShared.getBoard().getId()).get(index);
        dataShared.addPathRequest("/" + membership.getId());
    }

    @Given("Set user {string} as member type {string} to the board")
    public void setMemberToTheBoard(String username, String type) {
        boardActions.setMemberInBoard(dataShared.getBoard().getId(), username, type);
    }

    @Given("Set email key for the board")
    public void setMemberToTheBoard() {
        Board board = boardActions.generateEmailKeyBoard(dataShared.getBoard().getId());
        dataShared.setBoard(board);
    }

    @Given("Get board with my preferences")
    public void getBoardMyPrefs() {
        Board board = boardActions.getBoardWithMyPrefs(dataShared.getBoard().getId());
        dataShared.setBoard(board);
    }

    @Given("Set query param idEmailList")
    public void setEmailKeyBoarsBasePath() {
        StepsDef.request.queryParam("value", dataShared.getBoard().getMyPrefs().getIdEmailList());
    }


}

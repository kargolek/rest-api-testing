package api.cucumber_test;

import api.actions.BoardActions;
import api.actions.ListActions;
import api.pojo.lists.BoardList;
import io.cucumber.java.en.Given;

import java.util.List;

public class ListsSteps {

    BoardActions boardActions = new BoardActions();
    ListActions listActions = new ListActions();

    @Given("Set one board list as closed")
    public void setBoardListAsClosed(){
        List<BoardList> lists = boardActions.getBoardLists(DataShared.getInstance().getBoard().getId());
        listActions.closedList(lists.get(0).getId());
    }
}

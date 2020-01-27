package api.cucumber_test;

import api.pojo.Board;
import api.pojo.Card;
import api.pojo.Checklist;
import api.pojo.ListBoard;

import java.util.List;

public class DataShared {

    private static final DataShared dataShared = new DataShared();

    private Board board;
    private Card card;
    private Checklist checklist;
    private List<ListBoard> boardLists;

    private String tempPathRequest = "";

    public DataShared() {}

    public static DataShared getInstance() {
        return dataShared;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public String getTempPathRequest() {
        return tempPathRequest;
    }

    public void setTempPathRequest(String tempPathRequest) {
        this.tempPathRequest = tempPathRequest;
    }

    public void addPathRequest(String path) {
        this.tempPathRequest = this.tempPathRequest.concat(path);
    }

    public Checklist getChecklist() {
        return checklist;
    }

    public void setChecklist(Checklist checklist) {
        this.checklist = checklist;
    }
}

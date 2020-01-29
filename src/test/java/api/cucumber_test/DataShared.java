package api.cucumber_test;

import api.pojo.*;
import api.pojo.labels.Label;
import api.pojo.lists.BoardList;
import api.pojo.search.FoundMember;

public class DataShared {

    private static final DataShared dataShared = new DataShared();

    private Board board;
    private Card card;
    private Checklist checklist;
    private Label label;
    private BoardList boardList;
    private Object postObject;
    private FoundMember foundMember;

    private String tempPathRequest = "";

    public DataShared() {
    }

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

    public Object getPostObject() {
        return postObject;
    }

    public void setPostObject(Object postObject) {
        this.postObject = postObject;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public BoardList getBoardList() {
        return boardList;
    }

    public void setBoardList(BoardList boardList) {
        this.boardList = boardList;
    }

    public FoundMember getFoundMember() {
        return foundMember;
    }

    public void setFoundMember(FoundMember foundMember) {
        this.foundMember = foundMember;
    }
}

package api.cucumber_test;

import api.actions.BoardActions;
import api.actions.CardActions;
import api.pojo.Card;
import api.pojo.Checklist;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.apache.commons.lang3.RandomStringUtils;

public class CardsSteps {

    DataShared dataShared = DataShared.getInstance();
    private BoardActions boardActions = new BoardActions();
    private CardActions cardActions = new CardActions();

    @Given("Create a card with name {string}" )
    public void createCard(String name) {
        Card card = cardActions.createCard(name, boardActions.getBoardLists(dataShared.getBoard().getId()).get(0).getId());
        dataShared.setCard(card);
    }

    @Given("Create a checklist with name {string} on the card")
    public void createChecklist(String name) {
        Checklist checklist = cardActions.createChecklist(name, dataShared.getCard().getId());
        dataShared.setChecklist(checklist);
    }

    @Given("Set base path card id")
    public void setBasePathCardId() {
        dataShared.addPathRequest("/" + dataShared.getCard().getId());
    }

}

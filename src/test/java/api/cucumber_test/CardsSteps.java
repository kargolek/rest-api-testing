package api.cucumber_test;

import api.actions.BoardActions;
import api.actions.CardActions;
import api.pojo.Card;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.apache.commons.lang3.RandomStringUtils;

public class CardsSteps {

    private DataShared dataShared = DataShared.getInstance();

    private BoardActions boardActions = new BoardActions();
    private CardActions cardActions = new CardActions();

    @Before("@CreateCard")
    public void createCard() {
        Card card = cardActions.createCard("New card added",
                boardActions.getBoardLists(dataShared.getBoard().getId()).get(0).getId());
        dataShared.setCard(card);
    }

    @Before("@CreateCardRandomName")
    public void createCardRandomName() {
        Card card = cardActions.createCard(RandomStringUtils.random(20),
                boardActions.getBoardLists(dataShared.getBoard().getId()).get(0).getId());
        dataShared.setCard(card);
    }

    @Given("Set base path card id")
    public void setBasePathCardId(){
        dataShared.addPathRequest("/" + dataShared.getCard().getId());
    }

}

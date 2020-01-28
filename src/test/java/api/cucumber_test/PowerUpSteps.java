package api.cucumber_test;

import api.actions.PowerUpActions;
import io.cucumber.java.en.Given;

public class PowerUpSteps {

    @Given("Enable custom field on board")
    public void enableCustomFieldPluginOnBoard(){
        new PowerUpActions().enableCustomFieldPowerUp(DataShared.getInstance().getBoard().getId());
    }

}

package api.cucumber_test;

import api.actions.LabelActions;
import api.pojo.labels.Label;
import io.cucumber.java.en.Given;

public class LabelsSteps {

    private LabelActions labelActions = new LabelActions();

    @Given("Create label on board: name {string}, color {string}")
    public void createLabelOnBoard(String name, String color){
        Label label = labelActions.createLabelOnBoard(name, color, DataShared.getInstance().getBoard().getId());
        DataShared.getInstance().setLabel(label);
    }

}

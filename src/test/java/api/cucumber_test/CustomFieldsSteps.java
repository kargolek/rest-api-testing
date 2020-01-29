package api.cucumber_test;

import api.actions.CustomFieldsActions;
import api.pojo.custom_fields_body.CustomFieldBody;
import api.pojo.custom_fields_body.Option;
import api.pojo.custom_fields_body.Value;
import io.cucumber.java.en.Given;

import java.util.Arrays;

public class CustomFieldsSteps {

    @Given("Create custom field dropdown list body: name|optionOneName|optionsTwoName|position| {string}")
    public void createDropDownCustomFieldObject(String name){
        String[] data = name.split("\\|");
        CustomFieldBody customFieldBody = new CustomFieldBody(DataShared.getInstance().getBoard().getId(), "board",
                data[0], Arrays.asList(new Option("none", new Value(data[1]), 1024),
                        new Option("none", new Value(data[2]), 2048)),
                data[3], "list", true);
        DataShared.getInstance().setPostObject(customFieldBody);
    }

    @Given("Create custom field dropdown list on board")
    public void createCustomFieldsDropDownListOnBoard(){
        new CustomFieldsActions().createCustomFieldDropDownList(DataShared.getInstance().getBoard().getId());
    }

}

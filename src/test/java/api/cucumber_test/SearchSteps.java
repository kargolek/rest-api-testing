package api.cucumber_test;

import api.actions.SearchActions;
import api.pojo.search.FoundMember;
import io.cucumber.java.en.Given;

public class SearchSteps {

    @Given("Perform search member {string} set his id")
    public void searchMemberByUserName(String userName){
        FoundMember foundMember = new SearchActions().getMemberByUserName(userName).get(0);
        DataShared.getInstance().setFoundMember(foundMember);
    }


}

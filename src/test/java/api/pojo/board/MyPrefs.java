package api.pojo.board;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "showSidebar",
        "showSidebarMembers",
        "showSidebarBoardActions",
        "showSidebarActivity",
        "showListGuide",
        "idEmailList",
        "emailPosition"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class MyPrefs {

    @JsonProperty("showSidebar")
    private Boolean showSidebar;
    @JsonProperty("showSidebarMembers")
    private Boolean showSidebarMembers;
    @JsonProperty("showSidebarBoardActions")
    private Boolean showSidebarBoardActions;
    @JsonProperty("showSidebarActivity")
    private Boolean showSidebarActivity;
    @JsonProperty("showListGuide")
    private Boolean showListGuide;
    @JsonProperty("idEmailList")
    private Object idEmailList;
    @JsonProperty("emailPosition")
    private String emailPosition;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public MyPrefs() {
    }

    public MyPrefs(Boolean showSidebar, Boolean showSidebarMembers, Boolean showSidebarBoardActions, Boolean showSidebarActivity, Boolean showListGuide, Object idEmailList, String emailPosition) {
        super();
        this.showSidebar = showSidebar;
        this.showSidebarMembers = showSidebarMembers;
        this.showSidebarBoardActions = showSidebarBoardActions;
        this.showSidebarActivity = showSidebarActivity;
        this.showListGuide = showListGuide;
        this.idEmailList = idEmailList;
        this.emailPosition = emailPosition;
    }

    @JsonProperty("showSidebar")
    public Boolean getShowSidebar() {
        return showSidebar;
    }

    @JsonProperty("showSidebar")
    public void setShowSidebar(Boolean showSidebar) {
        this.showSidebar = showSidebar;
    }

    @JsonProperty("showSidebarMembers")
    public Boolean getShowSidebarMembers() {
        return showSidebarMembers;
    }

    @JsonProperty("showSidebarMembers")
    public void setShowSidebarMembers(Boolean showSidebarMembers) {
        this.showSidebarMembers = showSidebarMembers;
    }

    @JsonProperty("showSidebarBoardActions")
    public Boolean getShowSidebarBoardActions() {
        return showSidebarBoardActions;
    }

    @JsonProperty("showSidebarBoardActions")
    public void setShowSidebarBoardActions(Boolean showSidebarBoardActions) {
        this.showSidebarBoardActions = showSidebarBoardActions;
    }

    @JsonProperty("showSidebarActivity")
    public Boolean getShowSidebarActivity() {
        return showSidebarActivity;
    }

    @JsonProperty("showSidebarActivity")
    public void setShowSidebarActivity(Boolean showSidebarActivity) {
        this.showSidebarActivity = showSidebarActivity;
    }

    @JsonProperty("showListGuide")
    public Boolean getShowListGuide() {
        return showListGuide;
    }

    @JsonProperty("showListGuide")
    public void setShowListGuide(Boolean showListGuide) {
        this.showListGuide = showListGuide;
    }

    @JsonProperty("idEmailList")
    public Object getIdEmailList() {
        return idEmailList;
    }

    @JsonProperty("idEmailList")
    public void setIdEmailList(Object idEmailList) {
        this.idEmailList = idEmailList;
    }

    @JsonProperty("emailPosition")
    public String getEmailPosition() {
        return emailPosition;
    }

    @JsonProperty("emailPosition")
    public void setEmailPosition(String emailPosition) {
        this.emailPosition = emailPosition;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}

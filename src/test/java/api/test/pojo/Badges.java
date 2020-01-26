
package api.test.pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "votes",
    "viewingMemberVoted",
    "subscribed",
    "fogbugz",
    "checkItems",
    "checkItemsChecked",
    "comments",
    "attachments",
    "description",
    "due",
    "dueComplete"
})
public class Badges {

    @JsonProperty("votes")
    private Integer votes;
    @JsonProperty("viewingMemberVoted")
    private Boolean viewingMemberVoted;
    @JsonProperty("subscribed")
    private Boolean subscribed;
    @JsonProperty("fogbugz")
    private String fogbugz;
    @JsonProperty("checkItems")
    private Integer checkItems;
    @JsonProperty("checkItemsChecked")
    private Integer checkItemsChecked;
    @JsonProperty("comments")
    private Integer comments;
    @JsonProperty("attachments")
    private Integer attachments;
    @JsonProperty("description")
    private Boolean description;
    @JsonProperty("due")
    private Object due;
    @JsonProperty("dueComplete")
    private Boolean dueComplete;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("votes")
    public Integer getVotes() {
        return votes;
    }

    @JsonProperty("votes")
    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    @JsonProperty("viewingMemberVoted")
    public Boolean getViewingMemberVoted() {
        return viewingMemberVoted;
    }

    @JsonProperty("viewingMemberVoted")
    public void setViewingMemberVoted(Boolean viewingMemberVoted) {
        this.viewingMemberVoted = viewingMemberVoted;
    }

    @JsonProperty("subscribed")
    public Boolean getSubscribed() {
        return subscribed;
    }

    @JsonProperty("subscribed")
    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    @JsonProperty("fogbugz")
    public String getFogbugz() {
        return fogbugz;
    }

    @JsonProperty("fogbugz")
    public void setFogbugz(String fogbugz) {
        this.fogbugz = fogbugz;
    }

    @JsonProperty("checkItems")
    public Integer getCheckItems() {
        return checkItems;
    }

    @JsonProperty("checkItems")
    public void setCheckItems(Integer checkItems) {
        this.checkItems = checkItems;
    }

    @JsonProperty("checkItemsChecked")
    public Integer getCheckItemsChecked() {
        return checkItemsChecked;
    }

    @JsonProperty("checkItemsChecked")
    public void setCheckItemsChecked(Integer checkItemsChecked) {
        this.checkItemsChecked = checkItemsChecked;
    }

    @JsonProperty("comments")
    public Integer getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(Integer comments) {
        this.comments = comments;
    }

    @JsonProperty("attachments")
    public Integer getAttachments() {
        return attachments;
    }

    @JsonProperty("attachments")
    public void setAttachments(Integer attachments) {
        this.attachments = attachments;
    }

    @JsonProperty("description")
    public Boolean getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Boolean description) {
        this.description = description;
    }

    @JsonProperty("due")
    public Object getDue() {
        return due;
    }

    @JsonProperty("due")
    public void setDue(Object due) {
        this.due = due;
    }

    @JsonProperty("dueComplete")
    public Boolean getDueComplete() {
        return dueComplete;
    }

    @JsonProperty("dueComplete")
    public void setDueComplete(Boolean dueComplete) {
        this.dueComplete = dueComplete;
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

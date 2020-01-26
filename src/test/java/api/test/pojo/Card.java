
package api.test.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "badges",
    "checkItemStates",
    "closed",
    "dueComplete",
    "dateLastActivity",
    "desc",
    "descData",
    "due",
    "email",
    "idBoard",
    "idChecklists",
    "idList",
    "idMembers",
    "idMembersVoted",
    "idShort",
    "idAttachmentCover",
    "manualCoverAttachment",
    "labels",
    "idLabels",
    "name",
    "pos",
    "shortLink",
    "shortUrl",
    "subscribed",
    "url",
    "address",
    "locationName",
    "coordinates"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Card {

    @JsonProperty("id")
    private String id;
    @JsonProperty("badges")
    private Badges badges;
    @JsonProperty("checkItemStates")
    private List<Object> checkItemStates = null;
    @JsonProperty("closed")
    private Boolean closed;
    @JsonProperty("dueComplete")
    private Boolean dueComplete;
    @JsonProperty("dateLastActivity")
    private String dateLastActivity;
    @JsonProperty("desc")
    private String desc;
    @JsonProperty("descData")
    private Object descData;
    @JsonProperty("due")
    private Object due;
    @JsonProperty("email")
    private Object email;
    @JsonProperty("idBoard")
    private String idBoard;
    @JsonProperty("idChecklists")
    private List<Object> idChecklists = null;
    @JsonProperty("idList")
    private String idList;
    @JsonProperty("idMembers")
    private List<String> idMembers = null;
    @JsonProperty("idMembersVoted")
    private List<Object> idMembersVoted = null;
    @JsonProperty("idShort")
    private Integer idShort;
    @JsonProperty("idAttachmentCover")
    private String idAttachmentCover;
    @JsonProperty("manualCoverAttachment")
    private Boolean manualCoverAttachment;
    @JsonProperty("labels")
    private List<Label> labels = null;
    @JsonProperty("idLabels")
    private List<String> idLabels = null;
    @JsonProperty("name")
    private String name;
    @JsonProperty("pos")
    private Integer pos;
    @JsonProperty("shortLink")
    private String shortLink;
    @JsonProperty("shortUrl")
    private String shortUrl;
    @JsonProperty("subscribed")
    private Boolean subscribed;
    @JsonProperty("url")
    private String url;
    @JsonProperty("address")
    private String address;
    @JsonProperty("locationName")
    private String locationName;
    @JsonProperty("coordinates")
    private Coordinates coordinates;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("badges")
    public Badges getBadges() {
        return badges;
    }

    @JsonProperty("badges")
    public void setBadges(Badges badges) {
        this.badges = badges;
    }

    @JsonProperty("checkItemStates")
    public List<Object> getCheckItemStates() {
        return checkItemStates;
    }

    @JsonProperty("checkItemStates")
    public void setCheckItemStates(List<Object> checkItemStates) {
        this.checkItemStates = checkItemStates;
    }

    @JsonProperty("closed")
    public Boolean getClosed() {
        return closed;
    }

    @JsonProperty("closed")
    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    @JsonProperty("dueComplete")
    public Boolean getDueComplete() {
        return dueComplete;
    }

    @JsonProperty("dueComplete")
    public void setDueComplete(Boolean dueComplete) {
        this.dueComplete = dueComplete;
    }

    @JsonProperty("dateLastActivity")
    public String getDateLastActivity() {
        return dateLastActivity;
    }

    @JsonProperty("dateLastActivity")
    public void setDateLastActivity(String dateLastActivity) {
        this.dateLastActivity = dateLastActivity;
    }

    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    @JsonProperty("descData")
    public Object getDescData() {
        return descData;
    }

    @JsonProperty("descData")
    public void setDescData(Object descData) {
        this.descData = descData;
    }

    @JsonProperty("due")
    public Object getDue() {
        return due;
    }

    @JsonProperty("due")
    public void setDue(Object due) {
        this.due = due;
    }

    @JsonProperty("email")
    public Object getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(Object email) {
        this.email = email;
    }

    @JsonProperty("idBoard")
    public String getIdBoard() {
        return idBoard;
    }

    @JsonProperty("idBoard")
    public void setIdBoard(String idBoard) {
        this.idBoard = idBoard;
    }

    @JsonProperty("idChecklists")
    public List<Object> getIdChecklists() {
        return idChecklists;
    }

    @JsonProperty("idChecklists")
    public void setIdChecklists(List<Object> idChecklists) {
        this.idChecklists = idChecklists;
    }

    @JsonProperty("idList")
    public String getIdList() {
        return idList;
    }

    @JsonProperty("idList")
    public void setIdList(String idList) {
        this.idList = idList;
    }

    @JsonProperty("idMembers")
    public List<String> getIdMembers() {
        return idMembers;
    }

    @JsonProperty("idMembers")
    public void setIdMembers(List<String> idMembers) {
        this.idMembers = idMembers;
    }

    @JsonProperty("idMembersVoted")
    public List<Object> getIdMembersVoted() {
        return idMembersVoted;
    }

    @JsonProperty("idMembersVoted")
    public void setIdMembersVoted(List<Object> idMembersVoted) {
        this.idMembersVoted = idMembersVoted;
    }

    @JsonProperty("idShort")
    public Integer getIdShort() {
        return idShort;
    }

    @JsonProperty("idShort")
    public void setIdShort(Integer idShort) {
        this.idShort = idShort;
    }

    @JsonProperty("idAttachmentCover")
    public String getIdAttachmentCover() {
        return idAttachmentCover;
    }

    @JsonProperty("idAttachmentCover")
    public void setIdAttachmentCover(String idAttachmentCover) {
        this.idAttachmentCover = idAttachmentCover;
    }

    @JsonProperty("manualCoverAttachment")
    public Boolean getManualCoverAttachment() {
        return manualCoverAttachment;
    }

    @JsonProperty("manualCoverAttachment")
    public void setManualCoverAttachment(Boolean manualCoverAttachment) {
        this.manualCoverAttachment = manualCoverAttachment;
    }

    @JsonProperty("labels")
    public List<Label> getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    @JsonProperty("idLabels")
    public List<String> getIdLabels() {
        return idLabels;
    }

    @JsonProperty("idLabels")
    public void setIdLabels(List<String> idLabels) {
        this.idLabels = idLabels;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("pos")
    public Integer getPos() {
        return pos;
    }

    @JsonProperty("pos")
    public void setPos(Integer pos) {
        this.pos = pos;
    }

    @JsonProperty("shortLink")
    public String getShortLink() {
        return shortLink;
    }

    @JsonProperty("shortLink")
    public void setShortLink(String shortLink) {
        this.shortLink = shortLink;
    }

    @JsonProperty("shortUrl")
    public String getShortUrl() {
        return shortUrl;
    }

    @JsonProperty("shortUrl")
    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    @JsonProperty("subscribed")
    public Boolean getSubscribed() {
        return subscribed;
    }

    @JsonProperty("subscribed")
    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("locationName")
    public String getLocationName() {
        return locationName;
    }

    @JsonProperty("locationName")
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    @JsonProperty("coordinates")
    public Coordinates getCoordinates() {
        return coordinates;
    }

    @JsonProperty("coordinates")
    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "CardTrello{" +
                "id='" + id + '\'' +
                ", badges=" + badges +
                ", checkItemStates=" + checkItemStates +
                ", closed=" + closed +
                ", dueComplete=" + dueComplete +
                ", dateLastActivity='" + dateLastActivity + '\'' +
                ", desc='" + desc + '\'' +
                ", descData=" + descData +
                ", due=" + due +
                ", email=" + email +
                ", idBoard='" + idBoard + '\'' +
                ", idChecklists=" + idChecklists +
                ", idList='" + idList + '\'' +
                ", idMembers=" + idMembers +
                ", idMembersVoted=" + idMembersVoted +
                ", idShort=" + idShort +
                ", idAttachmentCover='" + idAttachmentCover + '\'' +
                ", manualCoverAttachment=" + manualCoverAttachment +
                ", labels=" + labels +
                ", idLabels=" + idLabels +
                ", name='" + name + '\'' +
                ", pos=" + pos +
                ", shortLink='" + shortLink + '\'' +
                ", shortUrl='" + shortUrl + '\'' +
                ", subscribed=" + subscribed +
                ", url='" + url + '\'' +
                ", address='" + address + '\'' +
                ", locationName='" + locationName + '\'' +
                ", coordinates=" + coordinates +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}

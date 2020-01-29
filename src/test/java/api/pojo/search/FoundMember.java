package api.pojo.search;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "id",
        "activityBlocked",
        "avatarHash",
        "avatarUrl",
        "fullName",
        "idMemberReferrer",
        "initials",
        "nonPublic",
        "nonPublicAvailable",
        "username",
        "confirmed",
        "email",
        "idBoards",
        "idOrganizations",
        "prefs",
        "similarity",
        "active"
})
public class FoundMember {

    @JsonProperty("id")
    private String id;
    @JsonProperty("activityBlocked")
    private Boolean activityBlocked;
    @JsonProperty("avatarHash")
    private Object avatarHash;
    @JsonProperty("avatarUrl")
    private Object avatarUrl;
    @JsonProperty("fullName")
    private String fullName;
    @JsonProperty("idMemberReferrer")
    private Object idMemberReferrer;
    @JsonProperty("initials")
    private String initials;
    @JsonProperty("nonPublic")
    private NonPublic nonPublic;
    @JsonProperty("nonPublicAvailable")
    private Boolean nonPublicAvailable;
    @JsonProperty("username")
    private String username;
    @JsonProperty("confirmed")
    private Boolean confirmed;
    @JsonProperty("email")
    private Object email;
    @JsonProperty("idBoards")
    private List<Object> idBoards = null;
    @JsonProperty("idOrganizations")
    private List<Object> idOrganizations = null;
    @JsonProperty("prefs")
    private Object prefs;
    @JsonProperty("similarity")
    private Integer similarity;
    @JsonProperty("active")
    private Boolean active;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public FoundMember() {
    }

    public FoundMember(String id, Boolean activityBlocked, Object avatarHash, Object avatarUrl, String fullName, Object idMemberReferrer, String initials, NonPublic nonPublic, Boolean nonPublicAvailable, String username, Boolean confirmed, Object email, List<Object> idBoards, List<Object> idOrganizations, Object prefs, Integer similarity, Boolean active) {
        super();
        this.id = id;
        this.activityBlocked = activityBlocked;
        this.avatarHash = avatarHash;
        this.avatarUrl = avatarUrl;
        this.fullName = fullName;
        this.idMemberReferrer = idMemberReferrer;
        this.initials = initials;
        this.nonPublic = nonPublic;
        this.nonPublicAvailable = nonPublicAvailable;
        this.username = username;
        this.confirmed = confirmed;
        this.email = email;
        this.idBoards = idBoards;
        this.idOrganizations = idOrganizations;
        this.prefs = prefs;
        this.similarity = similarity;
        this.active = active;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("activityBlocked")
    public Boolean getActivityBlocked() {
        return activityBlocked;
    }

    @JsonProperty("activityBlocked")
    public void setActivityBlocked(Boolean activityBlocked) {
        this.activityBlocked = activityBlocked;
    }

    @JsonProperty("avatarHash")
    public Object getAvatarHash() {
        return avatarHash;
    }

    @JsonProperty("avatarHash")
    public void setAvatarHash(Object avatarHash) {
        this.avatarHash = avatarHash;
    }

    @JsonProperty("avatarUrl")
    public Object getAvatarUrl() {
        return avatarUrl;
    }

    @JsonProperty("avatarUrl")
    public void setAvatarUrl(Object avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @JsonProperty("idMemberReferrer")
    public Object getIdMemberReferrer() {
        return idMemberReferrer;
    }

    @JsonProperty("idMemberReferrer")
    public void setIdMemberReferrer(Object idMemberReferrer) {
        this.idMemberReferrer = idMemberReferrer;
    }

    @JsonProperty("initials")
    public String getInitials() {
        return initials;
    }

    @JsonProperty("initials")
    public void setInitials(String initials) {
        this.initials = initials;
    }

    @JsonProperty("nonPublic")
    public NonPublic getNonPublic() {
        return nonPublic;
    }

    @JsonProperty("nonPublic")
    public void setNonPublic(NonPublic nonPublic) {
        this.nonPublic = nonPublic;
    }

    @JsonProperty("nonPublicAvailable")
    public Boolean getNonPublicAvailable() {
        return nonPublicAvailable;
    }

    @JsonProperty("nonPublicAvailable")
    public void setNonPublicAvailable(Boolean nonPublicAvailable) {
        this.nonPublicAvailable = nonPublicAvailable;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty("confirmed")
    public Boolean getConfirmed() {
        return confirmed;
    }

    @JsonProperty("confirmed")
    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    @JsonProperty("email")
    public Object getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(Object email) {
        this.email = email;
    }

    @JsonProperty("idBoards")
    public List<Object> getIdBoards() {
        return idBoards;
    }

    @JsonProperty("idBoards")
    public void setIdBoards(List<Object> idBoards) {
        this.idBoards = idBoards;
    }

    @JsonProperty("idOrganizations")
    public List<Object> getIdOrganizations() {
        return idOrganizations;
    }

    @JsonProperty("idOrganizations")
    public void setIdOrganizations(List<Object> idOrganizations) {
        this.idOrganizations = idOrganizations;
    }

    @JsonProperty("prefs")
    public Object getPrefs() {
        return prefs;
    }

    @JsonProperty("prefs")
    public void setPrefs(Object prefs) {
        this.prefs = prefs;
    }

    @JsonProperty("similarity")
    public Integer getSimilarity() {
        return similarity;
    }

    @JsonProperty("similarity")
    public void setSimilarity(Integer similarity) {
        this.similarity = similarity;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
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

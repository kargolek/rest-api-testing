
package api.test.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "desc",
    "descData",
    "closed",
    "idOrganization",
    "idEnterprise",
    "limits",
    "pinned",
    "shortLink",
    "powerUps",
    "dateLastActivity",
    "idTags",
    "datePluginDisable",
    "creationMethod",
    "ixUpdate",
    "enterpriseOwned",
    "id",
    "starred",
    "url",
    "prefs",
    "subscribed",
    "labelNames",
    "shortUrl",
    "templateGallery",
    "memberships"
})
public class MojaKlasa {

    @JsonProperty("name")
    private String name;
    @JsonProperty("desc")
    private String desc;
    @JsonProperty("descData")
    private Object descData;
    @JsonProperty("closed")
    private Boolean closed;
    @JsonProperty("idOrganization")
    private Object idOrganization;
    @JsonProperty("idEnterprise")
    private Object idEnterprise;
    @JsonProperty("limits")
    private Object limits;
    @JsonProperty("pinned")
    private Object pinned;
    @JsonProperty("shortLink")
    private String shortLink;
    @JsonProperty("powerUps")
    private List<Object> powerUps = null;
    @JsonProperty("dateLastActivity")
    private Object dateLastActivity;
    @JsonProperty("idTags")
    private List<Object> idTags = null;
    @JsonProperty("datePluginDisable")
    private Object datePluginDisable;
    @JsonProperty("creationMethod")
    private String creationMethod;
    @JsonProperty("ixUpdate")
    private Object ixUpdate;
    @JsonProperty("enterpriseOwned")
    private Boolean enterpriseOwned;
    @JsonProperty("id")
    private String id;
    @JsonProperty("starred")
    private Boolean starred;
    @JsonProperty("url")
    private String url;
    @JsonProperty("prefs")
    private Prefs prefs;
    @JsonProperty("subscribed")
    private Boolean subscribed;
    @JsonProperty("labelNames")
    private LabelNames labelNames;
    @JsonProperty("shortUrl")
    private String shortUrl;
    @JsonProperty("templateGallery")
    private Object templateGallery;
    @JsonProperty("memberships")
    private List<Membership> memberships = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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

    @JsonProperty("closed")
    public Boolean getClosed() {
        return closed;
    }

    @JsonProperty("closed")
    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    @JsonProperty("idOrganization")
    public Object getIdOrganization() {
        return idOrganization;
    }

    @JsonProperty("idOrganization")
    public void setIdOrganization(Object idOrganization) {
        this.idOrganization = idOrganization;
    }

    @JsonProperty("idEnterprise")
    public Object getIdEnterprise() {
        return idEnterprise;
    }

    @JsonProperty("idEnterprise")
    public void setIdEnterprise(Object idEnterprise) {
        this.idEnterprise = idEnterprise;
    }

    @JsonProperty("limits")
    public Object getLimits() {
        return limits;
    }

    @JsonProperty("limits")
    public void setLimits(Object limits) {
        this.limits = limits;
    }

    @JsonProperty("pinned")
    public Object getPinned() {
        return pinned;
    }

    @JsonProperty("pinned")
    public void setPinned(Object pinned) {
        this.pinned = pinned;
    }

    @JsonProperty("shortLink")
    public String getShortLink() {
        return shortLink;
    }

    @JsonProperty("shortLink")
    public void setShortLink(String shortLink) {
        this.shortLink = shortLink;
    }

    @JsonProperty("powerUps")
    public List<Object> getPowerUps() {
        return powerUps;
    }

    @JsonProperty("powerUps")
    public void setPowerUps(List<Object> powerUps) {
        this.powerUps = powerUps;
    }

    @JsonProperty("dateLastActivity")
    public Object getDateLastActivity() {
        return dateLastActivity;
    }

    @JsonProperty("dateLastActivity")
    public void setDateLastActivity(Object dateLastActivity) {
        this.dateLastActivity = dateLastActivity;
    }

    @JsonProperty("idTags")
    public List<Object> getIdTags() {
        return idTags;
    }

    @JsonProperty("idTags")
    public void setIdTags(List<Object> idTags) {
        this.idTags = idTags;
    }

    @JsonProperty("datePluginDisable")
    public Object getDatePluginDisable() {
        return datePluginDisable;
    }

    @JsonProperty("datePluginDisable")
    public void setDatePluginDisable(Object datePluginDisable) {
        this.datePluginDisable = datePluginDisable;
    }

    @JsonProperty("creationMethod")
    public String getCreationMethod() {
        return creationMethod;
    }

    @JsonProperty("creationMethod")
    public void setCreationMethod(String creationMethod) {
        this.creationMethod = creationMethod;
    }

    @JsonProperty("ixUpdate")
    public Object getIxUpdate() {
        return ixUpdate;
    }

    @JsonProperty("ixUpdate")
    public void setIxUpdate(Object ixUpdate) {
        this.ixUpdate = ixUpdate;
    }

    @JsonProperty("enterpriseOwned")
    public Boolean getEnterpriseOwned() {
        return enterpriseOwned;
    }

    @JsonProperty("enterpriseOwned")
    public void setEnterpriseOwned(Boolean enterpriseOwned) {
        this.enterpriseOwned = enterpriseOwned;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("starred")
    public Boolean getStarred() {
        return starred;
    }

    @JsonProperty("starred")
    public void setStarred(Boolean starred) {
        this.starred = starred;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("prefs")
    public Prefs getPrefs() {
        return prefs;
    }

    @JsonProperty("prefs")
    public void setPrefs(Prefs prefs) {
        this.prefs = prefs;
    }

    @JsonProperty("subscribed")
    public Boolean getSubscribed() {
        return subscribed;
    }

    @JsonProperty("subscribed")
    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    @JsonProperty("labelNames")
    public LabelNames getLabelNames() {
        return labelNames;
    }

    @JsonProperty("labelNames")
    public void setLabelNames(LabelNames labelNames) {
        this.labelNames = labelNames;
    }

    @JsonProperty("shortUrl")
    public String getShortUrl() {
        return shortUrl;
    }

    @JsonProperty("shortUrl")
    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    @JsonProperty("templateGallery")
    public Object getTemplateGallery() {
        return templateGallery;
    }

    @JsonProperty("templateGallery")
    public void setTemplateGallery(Object templateGallery) {
        this.templateGallery = templateGallery;
    }

    @JsonProperty("memberships")
    public List<Membership> getMemberships() {
        return memberships;
    }

    @JsonProperty("memberships")
    public void setMemberships(List<Membership> memberships) {
        this.memberships = memberships;
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

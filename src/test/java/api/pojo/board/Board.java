package api.pojo.board;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "desc",
        "descData",
        "closed",
        "idOrganization",
        "idEnterprise",
        "pinned",
        "url",
        "shortUrl",
        "prefs",
        "labelNames",
        "myPrefs"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Board {

    @JsonProperty("id")
    private String id;
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
    @JsonProperty("pinned")
    private Boolean pinned;
    @JsonProperty("url")
    private String url;
    @JsonProperty("shortUrl")
    private String shortUrl;
    @JsonProperty("prefs")
    private Prefs prefs;
    @JsonProperty("labelNames")
    private LabelNames labelNames;
    @JsonProperty("myPrefs")
    private MyPrefs myPrefs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Board() {
    }

    public Board(String id, String name, String desc, Object descData, Boolean closed, Object idOrganization, Object idEnterprise, Boolean pinned, String url, String shortUrl, Prefs prefs, LabelNames labelNames, MyPrefs myPrefs) {
        super();
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.descData = descData;
        this.closed = closed;
        this.idOrganization = idOrganization;
        this.idEnterprise = idEnterprise;
        this.pinned = pinned;
        this.url = url;
        this.shortUrl = shortUrl;
        this.prefs = prefs;
        this.labelNames = labelNames;
        this.myPrefs = myPrefs;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

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

    @JsonProperty("pinned")
    public Boolean getPinned() {
        return pinned;
    }

    @JsonProperty("pinned")
    public void setPinned(Boolean pinned) {
        this.pinned = pinned;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("shortUrl")
    public String getShortUrl() {
        return shortUrl;
    }

    @JsonProperty("shortUrl")
    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    @JsonProperty("prefs")
    public Prefs getPrefs() {
        return prefs;
    }

    @JsonProperty("prefs")
    public void setPrefs(Prefs prefs) {
        this.prefs = prefs;
    }

    @JsonProperty("labelNames")
    public LabelNames getLabelNames() {
        return labelNames;
    }

    @JsonProperty("labelNames")
    public void setLabelNames(LabelNames labelNames) {
        this.labelNames = labelNames;
    }

    @JsonProperty("myPrefs")
    public MyPrefs getMyPrefs() {
        return myPrefs;
    }

    @JsonProperty("myPrefs")
    public void setMyPrefs(MyPrefs myPrefs) {
        this.myPrefs = myPrefs;
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
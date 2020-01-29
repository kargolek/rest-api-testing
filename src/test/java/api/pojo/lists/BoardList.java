
package api.pojo.lists;

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
    "id",
    "name",
    "closed",
    "idBoard",
    "pos",
    "subscribed",
    "softLimit",
    "limits",
    "creationMethod"
})
public class BoardList {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("closed")
    private Boolean closed;
    @JsonProperty("idBoard")
    private String idBoard;
    @JsonProperty("pos")
    private Integer pos;
    @JsonProperty("subscribed")
    private Boolean subscribed;
    @JsonProperty("softLimit")
    private Object softLimit;
    @JsonProperty("limits")
    private Limits limits;
    @JsonProperty("creationMethod")
    private String creationMethod;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public BoardList() {
    }

    /**
     * 
     * @param subscribed
     * @param idBoard
     * @param pos
     * @param name
     * @param closed
     * @param id
     * @param limits
     * @param softLimit
     * @param creationMethod
     */
    public BoardList(String id, String name, Boolean closed, String idBoard, Integer pos, Boolean subscribed, Object softLimit, Limits limits, String creationMethod) {
        super();
        this.id = id;
        this.name = name;
        this.closed = closed;
        this.idBoard = idBoard;
        this.pos = pos;
        this.subscribed = subscribed;
        this.softLimit = softLimit;
        this.limits = limits;
        this.creationMethod = creationMethod;
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

    @JsonProperty("closed")
    public Boolean getClosed() {
        return closed;
    }

    @JsonProperty("closed")
    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    @JsonProperty("idBoard")
    public String getIdBoard() {
        return idBoard;
    }

    @JsonProperty("idBoard")
    public void setIdBoard(String idBoard) {
        this.idBoard = idBoard;
    }

    @JsonProperty("pos")
    public Integer getPos() {
        return pos;
    }

    @JsonProperty("pos")
    public void setPos(Integer pos) {
        this.pos = pos;
    }

    @JsonProperty("subscribed")
    public Boolean getSubscribed() {
        return subscribed;
    }

    @JsonProperty("subscribed")
    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    @JsonProperty("softLimit")
    public Object getSoftLimit() {
        return softLimit;
    }

    @JsonProperty("softLimit")
    public void setSoftLimit(Object softLimit) {
        this.softLimit = softLimit;
    }

    @JsonProperty("limits")
    public Limits getLimits() {
        return limits;
    }

    @JsonProperty("limits")
    public void setLimits(Limits limits) {
        this.limits = limits;
    }

    @JsonProperty("creationMethod")
    public String getCreationMethod() {
        return creationMethod;
    }

    @JsonProperty("creationMethod")
    public void setCreationMethod(String creationMethod) {
        this.creationMethod = creationMethod;
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

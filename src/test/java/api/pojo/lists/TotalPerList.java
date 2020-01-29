
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
    "status",
    "disableAt",
    "warnAt"
})
public class TotalPerList {

    @JsonProperty("status")
    private String status;
    @JsonProperty("disableAt")
    private Integer disableAt;
    @JsonProperty("warnAt")
    private Integer warnAt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public TotalPerList() {
    }

    /**
     * 
     * @param warnAt
     * @param disableAt
     * @param status
     */
    public TotalPerList(String status, Integer disableAt, Integer warnAt) {
        super();
        this.status = status;
        this.disableAt = disableAt;
        this.warnAt = warnAt;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("disableAt")
    public Integer getDisableAt() {
        return disableAt;
    }

    @JsonProperty("disableAt")
    public void setDisableAt(Integer disableAt) {
        this.disableAt = disableAt;
    }

    @JsonProperty("warnAt")
    public Integer getWarnAt() {
        return warnAt;
    }

    @JsonProperty("warnAt")
    public void setWarnAt(Integer warnAt) {
        this.warnAt = warnAt;
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

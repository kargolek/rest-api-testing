
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
    "openPerList",
    "totalPerList"
})
public class Cards {

    @JsonProperty("openPerList")
    private OpenPerList openPerList;
    @JsonProperty("totalPerList")
    private TotalPerList totalPerList;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Cards() {
    }

    /**
     * 
     * @param openPerList
     * @param totalPerList
     */
    public Cards(OpenPerList openPerList, TotalPerList totalPerList) {
        super();
        this.openPerList = openPerList;
        this.totalPerList = totalPerList;
    }

    @JsonProperty("openPerList")
    public OpenPerList getOpenPerList() {
        return openPerList;
    }

    @JsonProperty("openPerList")
    public void setOpenPerList(OpenPerList openPerList) {
        this.openPerList = openPerList;
    }

    @JsonProperty("totalPerList")
    public TotalPerList getTotalPerList() {
        return totalPerList;
    }

    @JsonProperty("totalPerList")
    public void setTotalPerList(TotalPerList totalPerList) {
        this.totalPerList = totalPerList;
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

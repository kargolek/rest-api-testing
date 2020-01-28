
package api.pojo.custom_fields_body;

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
    "idModel",
    "modelType",
    "name",
    "options",
    "pos",
    "type",
    "display_cardFront"
})
public class CustomFieldBody {

    @JsonProperty("idModel")
    private String idModel;
    @JsonProperty("modelType")
    private String modelType;
    @JsonProperty("name")
    private String name;
    @JsonProperty("options")
    private List<Option> options = null;
    @JsonProperty("pos")
    private String pos;
    @JsonProperty("type")
    private String type;
    @JsonProperty("display_cardFront")
    private Boolean displayCardFront;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public CustomFieldBody(){

    }

    public CustomFieldBody(String idModel, String modelType, String name, List<Option> options, String pos, String type, Boolean displayCardFront) {
        this.idModel = idModel;
        this.modelType = modelType;
        this.name = name;
        this.options = options;
        this.pos = pos;
        this.type = type;
        this.displayCardFront = displayCardFront;
    }

    @JsonProperty("idModel")
    public String getIdModel() {
        return idModel;
    }

    @JsonProperty("idModel")
    public void setIdModel(String idModel) {
        this.idModel = idModel;
    }

    @JsonProperty("modelType")
    public String getModelType() {
        return modelType;
    }

    @JsonProperty("modelType")
    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("options")
    public List<Option> getOptions() {
        return options;
    }

    @JsonProperty("options")
    public void setOptions(List<Option> options) {
        this.options = options;
    }

    @JsonProperty("pos")
    public String getPos() {
        return pos;
    }

    @JsonProperty("pos")
    public void setPos(String pos) {
        this.pos = pos;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("display_cardFront")
    public Boolean getDisplayCardFront() {
        return displayCardFront;
    }

    @JsonProperty("display_cardFront")
    public void setDisplayCardFront(Boolean displayCardFront) {
        this.displayCardFront = displayCardFront;
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

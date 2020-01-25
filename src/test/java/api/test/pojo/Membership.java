
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
    "id",
    "idMember",
    "memberType",
    "unconfirmed",
    "deactivated"
})
public class Membership {

    @JsonProperty("id")
    private String id;
    @JsonProperty("idMember")
    private String idMember;
    @JsonProperty("memberType")
    private String memberType;
    @JsonProperty("unconfirmed")
    private Boolean unconfirmed;
    @JsonProperty("deactivated")
    private Boolean deactivated;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("idMember")
    public String getIdMember() {
        return idMember;
    }

    @JsonProperty("idMember")
    public void setIdMember(String idMember) {
        this.idMember = idMember;
    }

    @JsonProperty("memberType")
    public String getMemberType() {
        return memberType;
    }

    @JsonProperty("memberType")
    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    @JsonProperty("unconfirmed")
    public Boolean getUnconfirmed() {
        return unconfirmed;
    }

    @JsonProperty("unconfirmed")
    public void setUnconfirmed(Boolean unconfirmed) {
        this.unconfirmed = unconfirmed;
    }

    @JsonProperty("deactivated")
    public Boolean getDeactivated() {
        return deactivated;
    }

    @JsonProperty("deactivated")
    public void setDeactivated(Boolean deactivated) {
        this.deactivated = deactivated;
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

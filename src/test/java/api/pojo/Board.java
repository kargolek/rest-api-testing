package api.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Board {

    private String id;
    private String name;
    private String descData;
    private boolean closed;
    private String idOrganization;
    private String idEnterprise;
    private boolean pinned;
    private String url;

    public Board(@JsonProperty("id") String id, @JsonProperty("name") String name, @JsonProperty("descData") String descData,
                 @JsonProperty("closed") boolean closed, @JsonProperty("idOrganization") String idOrganization, @JsonProperty("idEnterprise") String idEnterprise,
                 @JsonProperty("pinned") boolean pinned, @JsonProperty("url") String url) {
        this.id = id;
        this.name = name;
        this.descData = descData;
        this.closed = closed;
        this.idOrganization = idOrganization;
        this.idEnterprise = idEnterprise;
        this.pinned = pinned;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

   public String getDescData() {
        return descData;
    }

    public boolean isClosed() {
        return closed;
    }

    public String getIdOrganization() {
        return idOrganization;
    }

    public String getIdEnterprise() {
        return idEnterprise;
    }

    public boolean isPinned() {
        return pinned;
    }

    public String getUrl() {
        return url;
    }

    public String toString() {
        return String.format("Board data: id: %s name: %s", getId(), getName());
    }

}

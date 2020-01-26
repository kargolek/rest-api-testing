package api.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListBoard {

    private String id;
    private String name;
    private Boolean closed;
    private String idBoard;
    private Integer pos;
    private Boolean subscribed;

    public ListBoard(@JsonProperty("id") String id, @JsonProperty("name") String name, @JsonProperty("closed") Boolean closed,
                     @JsonProperty("idBoard") String idBoard, @JsonProperty("pos") Integer pos, @JsonProperty("subscribed") Boolean subscribed) {
        this.id = id;
        this.name = name;
        this.closed = closed;
        this.idBoard = idBoard;
        this.pos = pos;
        this.subscribed = subscribed;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Boolean getClosed() {
        return closed;
    }

    public String getIdBoard() {
        return idBoard;
    }

    public Integer getPos() {
        return pos;
    }

    public Boolean getSubscribed() {
        return subscribed;
    }
}

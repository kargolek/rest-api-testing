package api.pojo.board;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "green",
        "yellow",
        "orange",
        "red",
        "purple",
        "blue",
        "sky",
        "lime",
        "pink",
        "black"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class LabelNames {

    @JsonProperty("green")
    private String green;
    @JsonProperty("yellow")
    private String yellow;
    @JsonProperty("orange")
    private String orange;
    @JsonProperty("red")
    private String red;
    @JsonProperty("purple")
    private String purple;
    @JsonProperty("blue")
    private String blue;
    @JsonProperty("sky")
    private String sky;
    @JsonProperty("lime")
    private String lime;
    @JsonProperty("pink")
    private String pink;
    @JsonProperty("black")
    private String black;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public LabelNames() {
    }

    public LabelNames(String green, String yellow, String orange, String red, String purple, String blue, String sky, String lime, String pink, String black) {
        super();
        this.green = green;
        this.yellow = yellow;
        this.orange = orange;
        this.red = red;
        this.purple = purple;
        this.blue = blue;
        this.sky = sky;
        this.lime = lime;
        this.pink = pink;
        this.black = black;
    }

    @JsonProperty("green")
    public String getGreen() {
        return green;
    }

    @JsonProperty("green")
    public void setGreen(String green) {
        this.green = green;
    }

    @JsonProperty("yellow")
    public String getYellow() {
        return yellow;
    }

    @JsonProperty("yellow")
    public void setYellow(String yellow) {
        this.yellow = yellow;
    }

    @JsonProperty("orange")
    public String getOrange() {
        return orange;
    }

    @JsonProperty("orange")
    public void setOrange(String orange) {
        this.orange = orange;
    }

    @JsonProperty("red")
    public String getRed() {
        return red;
    }

    @JsonProperty("red")
    public void setRed(String red) {
        this.red = red;
    }

    @JsonProperty("purple")
    public String getPurple() {
        return purple;
    }

    @JsonProperty("purple")
    public void setPurple(String purple) {
        this.purple = purple;
    }

    @JsonProperty("blue")
    public String getBlue() {
        return blue;
    }

    @JsonProperty("blue")
    public void setBlue(String blue) {
        this.blue = blue;
    }

    @JsonProperty("sky")
    public String getSky() {
        return sky;
    }

    @JsonProperty("sky")
    public void setSky(String sky) {
        this.sky = sky;
    }

    @JsonProperty("lime")
    public String getLime() {
        return lime;
    }

    @JsonProperty("lime")
    public void setLime(String lime) {
        this.lime = lime;
    }

    @JsonProperty("pink")
    public String getPink() {
        return pink;
    }

    @JsonProperty("pink")
    public void setPink(String pink) {
        this.pink = pink;
    }

    @JsonProperty("black")
    public String getBlack() {
        return black;
    }

    @JsonProperty("black")
    public void setBlack(String black) {
        this.black = black;
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

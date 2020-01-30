package api.pojo.board;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BoardCreate {

    private String name;
    private boolean defaultLabel;
    private boolean defaultLists;
    private String desc;
    private String idOrganization;
    private String idBoardSource;
    private String keepFromSource;
    private String powerUps;
    private String prefs_permissionLevel;
    private String prefs_voting;
    private String prefs_comments;
    private String prefs_invitations;
    private boolean prefs_selfJoin;
    private boolean prefs_cardCovers;
    private String prefs_background;
    private String prefs_cardAging;

    public BoardCreate(){}

    public BoardCreate(String name, boolean defaultLabel, boolean defaultLists, String desc, String idOrganization, String idBoardSource, String keepFromSource, String powerUps, String prefs_permissionLevel, String prefs_voting, String prefs_comments, String prefs_invitations, boolean prefs_selfJoin, boolean prefs_cardCovers, String prefs_background, String prefs_cardAging) {
        this.name = name;
        this.defaultLabel = defaultLabel;
        this.defaultLists = defaultLists;
        this.desc = desc;
        this.idOrganization = idOrganization;
        this.idBoardSource = idBoardSource;
        this.keepFromSource = keepFromSource;
        this.powerUps = powerUps;
        this.prefs_permissionLevel = prefs_permissionLevel;
        this.prefs_voting = prefs_voting;
        this.prefs_comments = prefs_comments;
        this.prefs_invitations = prefs_invitations;
        this.prefs_selfJoin = prefs_selfJoin;
        this.prefs_cardCovers = prefs_cardCovers;
        this.prefs_background = prefs_background;
        this.prefs_cardAging = prefs_cardAging;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDefaultLabel() {
        return defaultLabel;
    }

    public void setDefaultLabel(boolean defaultLabel) {
        this.defaultLabel = defaultLabel;
    }

    public boolean isDefaultLists() {
        return defaultLists;
    }

    public void setDefaultLists(boolean defaultLists) {
        this.defaultLists = defaultLists;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getIdOrganization() {
        return idOrganization;
    }

    public void setIdOrganization(String idOrganization) {
        this.idOrganization = idOrganization;
    }

    public String getIdBoardSource() {
        return idBoardSource;
    }

    public void setIdBoardSource(String idBoardSource) {
        this.idBoardSource = idBoardSource;
    }

    public String getKeepFromSource() {
        return keepFromSource;
    }

    public void setKeepFromSource(String keepFromSource) {
        this.keepFromSource = keepFromSource;
    }

    public String getPowerUps() {
        return powerUps;
    }

    public void setPowerUps(String powerUps) {
        this.powerUps = powerUps;
    }

    public String getPrefs_permissionLevel() {
        return prefs_permissionLevel;
    }

    public void setPrefs_permissionLevel(String prefs_permissionLevel) {
        this.prefs_permissionLevel = prefs_permissionLevel;
    }

    public String getPrefs_voting() {
        return prefs_voting;
    }

    public void setPrefs_voting(String prefs_voting) {
        this.prefs_voting = prefs_voting;
    }

    public String getPrefs_comments() {
        return prefs_comments;
    }

    public void setPrefs_comments(String prefs_comments) {
        this.prefs_comments = prefs_comments;
    }

    public String getPrefs_invitations() {
        return prefs_invitations;
    }

    public void setPrefs_invitations(String prefs_invitations) {
        this.prefs_invitations = prefs_invitations;
    }

    public boolean isPrefs_selfJoin() {
        return prefs_selfJoin;
    }

    public void setPrefs_selfJoin(boolean prefs_selfJoin) {
        this.prefs_selfJoin = prefs_selfJoin;
    }

    public boolean isPrefs_cardCovers() {
        return prefs_cardCovers;
    }

    public void setPrefs_cardCovers(boolean prefs_cardCovers) {
        this.prefs_cardCovers = prefs_cardCovers;
    }

    public String getPrefs_background() {
        return prefs_background;
    }

    public void setPrefs_background(String prefs_background) {
        this.prefs_background = prefs_background;
    }

    public String getPrefs_cardAging() {
        return prefs_cardAging;
    }

    public void setPrefs_cardAging(String prefs_cardAging) {
        this.prefs_cardAging = prefs_cardAging;
    }
}

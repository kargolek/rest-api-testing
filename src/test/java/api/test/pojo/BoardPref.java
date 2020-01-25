package api.test.pojo;

public class BoardPref {

    String permissionLevel;
    boolean hideVotes;
    String voting;
    String comments;
    String invitations;
    boolean selfJoin;
    boolean cardCovers;
    boolean isTemplate;
    String cardAging;
    boolean calendarFeedEnabled;
    String background;
    String backgroundImage;
    String backgroundImageScaled;
    boolean backgroundTile;
    String backgroundBrightness;
    String backgroundColor;
    String backgroundBottomColor;
    String backgroundTopColor;
    boolean canBePublic;
    boolean canBeEnterprise;
    boolean canBeOrg;
    boolean canBePrivate;
    boolean canInvite;

    public BoardPref(String permissionLevel, boolean hideVotes, String voting, String comments, String invitations, boolean selfJoin, boolean cardCovers, boolean isTemplate, String cardAging, boolean calendarFeedEnabled, String background, String backgroundImage, String backgroundImageScaled, boolean backgroundTile, String backgroundBrightness, String backgroundColor, String backgroundBottomColor, String backgroundTopColor, boolean canBePublic, boolean canBeEnterprise, boolean canBeOrg, boolean canBePrivate, boolean canInvite) {
        this.permissionLevel = permissionLevel;
        this.hideVotes = hideVotes;
        this.voting = voting;
        this.comments = comments;
        this.invitations = invitations;
        this.selfJoin = selfJoin;
        this.cardCovers = cardCovers;
        this.isTemplate = isTemplate;
        this.cardAging = cardAging;
        this.calendarFeedEnabled = calendarFeedEnabled;
        this.background = background;
        this.backgroundImage = backgroundImage;
        this.backgroundImageScaled = backgroundImageScaled;
        this.backgroundTile = backgroundTile;
        this.backgroundBrightness = backgroundBrightness;
        this.backgroundColor = backgroundColor;
        this.backgroundBottomColor = backgroundBottomColor;
        this.backgroundTopColor = backgroundTopColor;
        this.canBePublic = canBePublic;
        this.canBeEnterprise = canBeEnterprise;
        this.canBeOrg = canBeOrg;
        this.canBePrivate = canBePrivate;
        this.canInvite = canInvite;
    }

    public String getPermissionLevel() {
        return permissionLevel;
    }

    public boolean isHideVotes() {
        return hideVotes;
    }

    public String getVoting() {
        return voting;
    }

    public String getComments() {
        return comments;
    }

    public String getInvitations() {
        return invitations;
    }

    public boolean isSelfJoin() {
        return selfJoin;
    }

    public boolean isCardCovers() {
        return cardCovers;
    }

    public boolean isTemplate() {
        return isTemplate;
    }

    public String getCardAging() {
        return cardAging;
    }

    public boolean isCalendarFeedEnabled() {
        return calendarFeedEnabled;
    }

    public String getBackground() {
        return background;
    }

    public String getBackgroundImage() {
        return backgroundImage;
    }

    public String getBackgroundImageScaled() {
        return backgroundImageScaled;
    }

    public boolean isBackgroundTile() {
        return backgroundTile;
    }

    public String getBackgroundBrightness() {
        return backgroundBrightness;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getBackgroundBottomColor() {
        return backgroundBottomColor;
    }

    public String getBackgroundTopColor() {
        return backgroundTopColor;
    }

    public boolean isCanBePublic() {
        return canBePublic;
    }

    public boolean isCanBeEnterprise() {
        return canBeEnterprise;
    }

    public boolean isCanBeOrg() {
        return canBeOrg;
    }

    public boolean isCanBePrivate() {
        return canBePrivate;
    }

    public boolean isCanInvite() {
        return canInvite;
    }
}

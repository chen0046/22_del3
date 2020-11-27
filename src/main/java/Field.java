import java.awt.*;

public class Field {
    String title;
    String subText;
    String description;
    Color main;
    Color secondary;

    boolean start;
    boolean jail;
    boolean chance;
    boolean parkering;
    boolean goToJail;
    boolean ownable;

    public boolean isJail() {
        return jail;
    }
    public void setJail(boolean jail) {
        this.jail = jail;
    }

    public boolean isChance(){
        return chance;
    }
    public void setChance(boolean chance){this.chance = chance;}

    public boolean isParkering() {
        return parkering;
    }
    public void setParkering(boolean parkering){this.parkering = parkering;}

    public boolean isGoToJail(){
        return goToJail;
    }
    public void setGoToJail(boolean goToJail){this.goToJail = goToJail;}

    public boolean isOwnable() {
        return ownable;
    }
    public void setOwnable(boolean ownable) {
        this.ownable = ownable;
    }


    public Color getMain() {
        return main;
    }

    public void setMain(Color main) {
        this.main = main;
    }

    public Color getSecondary() {
        return secondary;
    }

    public void setSecondary(Color secondary) {
        this.secondary = secondary;
    }


    public Field() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubText() {
        return subText;
    }

    public void setSubText(String subText) {
        this.subText = subText;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }
}


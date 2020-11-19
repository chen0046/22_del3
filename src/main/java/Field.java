import java.awt.*;

public class Field {
    String title;
    String subText;
    String description;
    String rent;
    Color main;
    Color secondary;
    boolean start;
    boolean jail;


    public boolean isJail() {
        return jail;
    }

    public void setJail(boolean jail) {
        this.jail = jail;
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

    public String getRent() {
        return rent;
    }

    public void setRent(String rent) {
        this.rent = rent;
    }

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }
}


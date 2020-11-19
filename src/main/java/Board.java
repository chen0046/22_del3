import java.awt.*;

public class Board {
    Field[] fields;

    public Board() {
        fields = new Field[24];
        for (int i = 0; i < 24; i++) {
            fields[i] = new Field();

        }
    }
    public void setFields(Field[] fields) {
        this.fields = fields;
        fields[0].setTitle("Start"); fields[0].setSubText("Modtag 2 moneter."); fields[0].setDescription("Start"); fields[0].setRent("Start"); fields[0].setStart(true);
        fields[1].setTitle("Burgerbar"); fields[1].setSubText("M1"); fields[1].setDescription("."); fields[1].setRent(":"); fields[1].setMain(Color.black); fields[1].setSecondary(new Color(102,153,0));
        fields[2].setTitle("Pizzahuset"); fields[2].setSubText("M1"); fields[2].setDescription("."); fields[2].setRent("."); fields[2].setMain(Color.black); fields[2].setSecondary(new Color(102,153,0));
        fields[3].setTitle("?"); fields[3].setSubText(""); fields[3].setDescription("."); fields[3].setRent("."); fields[3].setMain(Color.black); fields[3].setSecondary(Color.white);
        fields[4].setTitle("Slikbutikken"); fields[4].setSubText("M1"); fields[4].setDescription("."); fields[4].setRent("."); fields[4].setMain(Color.black); fields[4].setSecondary(new Color(51, 153, 255));
        fields[5].setTitle("Iskiosken"); fields[5].setSubText("M1"); fields[5].setDescription("."); fields[5].setRent("."); fields[5].setMain(Color.black); fields[5].setSecondary(new Color(51, 153, 255));
        fields[6].setTitle("Fængsel"); fields[6].setJail(true);
        fields[7].setTitle("Museet"); fields[7].setSubText("M2"); fields[7].setDescription("."); fields[7].setRent("."); fields[7].setMain(Color.black); fields[7].setSecondary(new Color(153, 51, 102));
        fields[8].setTitle("Bibliotek"); fields[8].setSubText("M2"); fields[8].setDescription("."); fields[8].setRent("."); fields[8].setMain(Color.black); fields[8].setSecondary(new Color(153, 51, 102));
        fields[9].setTitle("?"); fields[9].setSubText("."); fields[9].setDescription("."); fields[9].setRent("."); fields[9].setMain(Color.black); fields[9].setSecondary(Color.white);
        fields[10].setTitle("Skaterpark"); fields[10].setSubText("M2"); fields[10].setDescription("."); fields[10].setRent(".");fields[10].setMain(Color.black); fields[10].setSecondary(new Color(255, 187, 51));
        fields[11].setTitle("Svømmepool"); fields[11].setSubText("M2"); fields[11].setDescription("."); fields[11].setRent(".");fields[11].setMain(Color.black); fields[11].setSecondary(new Color(255, 187, 51));
        fields[12].setTitle("Gratis parkering"); fields[12].setSubText("."); fields[12].setDescription("."); fields[12].setRent(".");fields[12].setMain(Color.black); fields[12].setSecondary(Color.white);
        fields[13].setTitle("Spillehallen"); fields[13].setSubText("M3"); fields[13].setDescription("."); fields[13].setRent(".");fields[13].setMain(Color.black); fields[13].setSecondary(new Color(204, 0, 0));
        fields[14].setTitle("Biografen"); fields[14].setSubText("M3"); fields[14].setDescription("."); fields[14].setRent(".");fields[14].setMain(Color.black); fields[14].setSecondary(new Color(204, 0, 0));
        fields[15].setTitle("?"); fields[15].setSubText("."); fields[15].setDescription("."); fields[15].setRent(".");fields[15].setMain(Color.black); fields[15].setSecondary(Color.white);
        fields[16].setTitle("Legetøjsbutik"); fields[16].setSubText("M3"); fields[16].setDescription("."); fields[16].setRent(".");fields[16].setMain(Color.black); fields[16].setSecondary(new Color(255, 255, 0));
        fields[17].setTitle("Dyrehandel"); fields[17].setSubText("M3"); fields[17].setDescription("."); fields[17].setRent(".");fields[17].setMain(Color.black); fields[17].setSecondary(new Color(255, 255, 0));
        fields[18].setTitle("Gå i fængsel"); fields[18].setSubText("."); fields[18].setDescription("."); fields[18].setRent(".");fields[18].setMain(Color.black); fields[18].setSecondary(Color.white);
        fields[19].setTitle("Bowlinghal"); fields[19].setSubText("M4"); fields[19].setDescription("."); fields[19].setRent(".");fields[19].setMain(Color.black); fields[19].setSecondary(new Color(0, 128, 43));
        fields[20].setTitle("Zoo"); fields[20].setSubText("M4"); fields[20].setDescription("."); fields[20].setRent(".");fields[20].setMain(Color.black); fields[20].setSecondary(new Color(0, 128, 43));
        fields[21].setTitle("?"); fields[21].setSubText("."); fields[21].setDescription("."); fields[21].setRent(".");fields[21].setMain(Color.black); fields[21].setSecondary(Color.white);
        fields[22].setTitle("Vandland"); fields[22].setSubText("M5"); fields[22].setDescription("."); fields[22].setRent(".");fields[22].setMain(Color.black); fields[22].setSecondary(new Color(0, 0, 153));
        fields[23].setTitle("Strandpromenade"); fields[23].setSubText("M5"); fields[23].setDescription("."); fields[23].setRent(".");fields[23].setMain(Color.black); fields[23].setSecondary(new Color(0, 0, 153));

    }
    public Field[] getFields() {
        return fields;
    }
}


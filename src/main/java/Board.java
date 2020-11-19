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
        fields[1].setTitle("Burgerbar"); fields[1].setSubText("."); fields[1].setDescription("."); fields[1].setRent(":"); fields[1].setMain(Color.white); fields[1].setSecondary(Color.yellow);
        fields[2].setTitle("Pizzahuset"); fields[2].setSubText("."); fields[2].setDescription("."); fields[2].setRent("."); fields[2].setMain(Color.white); fields[2].setSecondary(Color.yellow);
        fields[3].setTitle("?"); fields[3].setSubText("."); fields[3].setDescription("."); fields[3].setRent("."); fields[3].setMain(Color.white); fields[3].setSecondary(Color.yellow);
        fields[4].setTitle("Slikbutikken"); fields[4].setSubText("."); fields[4].setDescription("."); fields[4].setRent("."); fields[4].setMain(Color.white); fields[4].setSecondary(Color.yellow);
        fields[5].setTitle("Iskiosken"); fields[5].setSubText("."); fields[5].setDescription("."); fields[5].setRent("."); fields[5].setMain(Color.white); fields[5].setSecondary(Color.yellow);
        fields[6].setTitle("Fængsel"); fields[6].setJail(true);
        fields[7].setTitle("Museet"); fields[7].setSubText("."); fields[7].setDescription("."); fields[7].setRent("."); fields[7].setMain(Color.white); fields[7].setSecondary(Color.yellow);
        fields[8].setTitle("Bibliotek"); fields[8].setSubText("."); fields[8].setDescription("."); fields[8].setRent("."); fields[8].setMain(Color.white); fields[8].setSecondary(Color.yellow);
        fields[9].setTitle("?"); fields[9].setSubText("."); fields[9].setDescription("."); fields[9].setRent("."); fields[9].setMain(Color.white); fields[9].setSecondary(Color.yellow);
        fields[10].setTitle("Skaterpark"); fields[10].setSubText("."); fields[10].setDescription("."); fields[10].setRent(".");fields[10].setMain(Color.white); fields[10].setSecondary(Color.yellow);
        fields[11].setTitle("Svømmepool"); fields[11].setSubText("."); fields[11].setDescription("."); fields[11].setRent(".");fields[11].setMain(Color.white); fields[11].setSecondary(Color.yellow);
        fields[12].setTitle("?"); fields[12].setSubText("."); fields[12].setDescription("."); fields[12].setRent(".");fields[12].setMain(Color.white); fields[12].setSecondary(Color.yellow);
        fields[13].setTitle("Spillehallen"); fields[13].setSubText("."); fields[13].setDescription("."); fields[13].setRent(".");fields[13].setMain(Color.white); fields[13].setSecondary(Color.yellow);
        fields[14].setTitle("Biografen"); fields[14].setSubText("."); fields[14].setDescription("."); fields[14].setRent(".");fields[14].setMain(Color.white); fields[14].setSecondary(Color.yellow);
        fields[15].setTitle("?"); fields[15].setSubText("."); fields[15].setDescription("."); fields[15].setRent(".");fields[15].setMain(Color.white); fields[15].setSecondary(Color.yellow);
        fields[16].setTitle("Legetøjsbutik"); fields[16].setSubText("."); fields[16].setDescription("."); fields[16].setRent(".");fields[16].setMain(Color.white); fields[16].setSecondary(Color.yellow);
        fields[17].setTitle("Dyrehandel"); fields[17].setSubText("."); fields[17].setDescription("."); fields[17].setRent(".");fields[17].setMain(Color.white); fields[17].setSecondary(Color.yellow);
        fields[18].setTitle("Fængsel"); fields[18].setSubText("."); fields[18].setDescription("."); fields[18].setRent(".");fields[18].setMain(Color.white); fields[18].setSecondary(Color.yellow);
        fields[19].setTitle("Bowlinghal"); fields[19].setSubText("."); fields[19].setDescription("."); fields[19].setRent(".");fields[19].setMain(Color.white); fields[19].setSecondary(Color.yellow);
        fields[20].setTitle("Zoo"); fields[20].setSubText("."); fields[20].setDescription("."); fields[20].setRent(".");fields[20].setMain(Color.white); fields[20].setSecondary(Color.yellow);
        fields[21].setTitle("?"); fields[21].setSubText("."); fields[21].setDescription("."); fields[21].setRent(".");fields[21].setMain(Color.white); fields[21].setSecondary(Color.yellow);
        fields[22].setTitle("Vandland"); fields[22].setSubText("."); fields[22].setDescription("."); fields[22].setRent(".");fields[22].setMain(Color.white); fields[22].setSecondary(Color.yellow);
        fields[23].setTitle("Strandpromenade"); fields[23].setSubText("."); fields[23].setDescription("."); fields[23].setRent(".");fields[23].setMain(Color.white); fields[23].setSecondary(Color.yellow);

    }
    public Field[] getFields() {
        return fields;
    }
}


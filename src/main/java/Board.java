public class Board {
    Field[] fields;

    public Board(){
        fields = new Field[24];
        for (int i = 0; i <24 ; i++) {
            fields[i] = new Field();

        }
        public void setFields() {
            int q = 0;
            fields[q].setTitle("Start"); fields[q].setSubText("Modtag 2 moneter."); fields[q].setDescription("Start"); fields[q].setRent("Start");
            fields[q++].setTitle("Burgerbar"); fields[q].setSubText("."); fields[q].setDescription("."); fields[q].setRent(":");
            fields[q++].setTitle("Pizzahuset"); fields[q].setSubText("."); fields[q].setDescription("."); fields[q].setRent(".");
            fields[q++].setTitle("?"); fields[q].setSubText("."); fields[q].setDescription("."); fields[q].setRent(".");
            fields[q++].setTitle("Slikbutikken"); fields[q].setSubText("."); fields[q].setDescription("."); fields[q].setRent(".");
            fields[q++].setTitle("Iskiosken"); fields[q].setSubText("."); fields[q].setDescription("."); fields[q].setRent(".");
            fields[q++].setTitle("Fængsel"); fields[q].setSubText("."); fields[q].setDescription("."); fields[q].setRent(".");
            fields[q++].setTitle("Museet"); fields[q].setSubText("."); fields[q].setDescription("."); fields[q].setRent(".");
            fields[q++].setTitle("Bibliotek"); fields[q].setSubText("."); fields[q].setDescription("."); fields[q].setRent(".");
            fields[q++].setTitle("?"); fields[q].setSubText("."); fields[q].setDescription("."); fields[q].setRent(".");
            fields[q++].setTitle("Skaterpark"); fields[q].setSubText("."); fields[q].setDescription("."); fields[q].setRent(".");
            fields[q++].setTitle("Svømmepool"); fields[q].setSubText("."); fields[q].setDescription("."); fields[q].setRent(".");
            fields[q++].setTitle("?"); fields[q].setSubText("."); fields[q].setDescription("."); fields[q].setRent(".");
            fields[q++].setTitle("Spillehallen"); fields[q].setSubText("."); fields[q].setDescription("."); fields[q].setRent(".");
            fields[q++].setTitle("Biografen"); fields[q].setSubText("."); fields[q].setDescription("."); fields[q].setRent(".");
            fields[q++].setTitle("?"); fields[q].setSubText("."); fields[q].setDescription("."); fields[q].setRent(".");
            fields[q++].setTitle("Legetøjsbutik"); fields[q].setSubText("."); fields[q].setDescription("."); fields[q].setRent(".");
            fields[q++].setTitle("Dyrehandel"); fields[q].setSubText("."); fields[q].setDescription("."); fields[q].setRent(".");
            fields[q++].setTitle("Fængsel"); fields[q].setSubText("."); fields[q].setDescription("."); fields[q].setRent(".");
            fields[q++].setTitle("Bowlinghal"); fields[q].setSubText("."); fields[q].setDescription("."); fields[q].setRent(".");
            fields[q++].setTitle("Zoo"); fields[q].setSubText("."); fields[q].setDescription("."); fields[q].setRent(".");
            fields[q++].setTitle("?"); fields[q].setSubText("."); fields[q].setDescription("."); fields[q].setRent(".");
            fields[q++].setTitle("Vandland"); fields[q].setSubText("."); fields[q].setDescription("."); fields[q].setRent(".");
            fields[q++].setTitle("Strandpromenade"); fields[q].setSubText("."); fields[q].setDescription("."); fields[q].setRent(".");
        }
    }

    public Field[] getFields() {
        return fields;
    }



}

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
            fields[q++].setTitle() fields[q].setSubText(); fields[q].setDescription(); fields[q].setRent();
            fields[q++].setTitle(); fields[q].setSubText(); fields[q].setDescription(); fields[q].setRent();
            fields[q++].setTitle(); fields[q].setSubText(); fields[q].setDescription(); fields[q].setRent();
            fields[q++].setTitle(); fields[q].setSubText(); fields[q].setDescription(); fields[q].setRent();
            fields[q++].setTitle(); fields[q].setSubText(); fields[q].setDescription(); fields[q].setRent();
            fields[q++].setTitle(); fields[q].setSubText(); fields[q].setDescription(); fields[q].setRent();
            fields[q++].setTitle(); fields[q].setSubText(); fields[q].setDescription(); fields[q].setRent();
            fields[q++].setTitle(); fields[q].setSubText(); fields[q].setDescription(); fields[q].setRent();
            fields[q++].setTitle(); fields[q].setSubText(); fields[q].setDescription(); fields[q].setRent();
            fields[q++].setTitle(); fields[q].setSubText(); fields[q].setDescription(); fields[q].setRent();
            fields[q++].setTitle(); fields[q].setSubText(); fields[q].setDescription(); fields[q].setRent();
            fields[q++].setTitle(); fields[q].setSubText(); fields[q].setDescription(); fields[q].setRent();
            fields[q++].setTitle(); fields[q].setSubText(); fields[q].setDescription(); fields[q].setRent();
            fields[q++].setTitle(); fields[q].setSubText(); fields[q].setDescription(); fields[q].setRent();
            fields[q++].setTitle(); fields[q].setSubText(); fields[q].setDescription(); fields[q].setRent();
            fields[q++].setTitle(); fields[q].setSubText(); fields[q].setDescription(); fields[q].setRent();
            fields[q++].setTitle(); fields[q].setSubText(); fields[q].setDescription(); fields[q].setRent();
            fields[q++].setTitle(); fields[q].setSubText(); fields[q].setDescription(); fields[q].setRent();
            fields[q++].setTitle(); fields[q].setSubText(); fields[q].setDescription(); fields[q].setRent();
            fields[q++].setTitle(); fields[q].setSubText(); fields[q].setDescription(); fields[q].setRent();
            fields[q++].setTitle(); fields[q].setSubText(); fields[q].setDescription(); fields[q].setRent();
        }
    }

    public Field[] getFields() {
        return fields;
    }



}

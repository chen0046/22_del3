public class Board {
    Field[] fields;

    public Board(){
        fields = new Field[24];
        for (int i = 0; i <24 ; i++) {
            fields[i] = new Field();

        }
    }

    public Field[] getFields() {
        return fields;
    }



}



public class Spiller {

    String navn;
    Konto spillerKonto = new Konto();
    int pos;
    int Birthday;

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
        if(getPos() > 23) {
            pos = getPos() - 23;
        }
    }

    public int getBirthday() {
        return Birthday;
    }

    public void setBirthday(int birthday) {
        Birthday = birthday;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
}



public class Spiller {

    String navn; //Navn skal defineres som String da det involverer tekst
    Konto spillerKonto = new Konto();
    int pos;
    int Birthday;

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getBirthday() {
        return Birthday;
    }

    public void setBirthday(int birthday) {
        Birthday = birthday;
    }

    //Her gør vi så når man skriver getNavn så får man det definerede Navn
    public String getNavn() {
        return navn;
    }

    //Her gør vi så når man skriver setNavn så definerer vi navnet
    public void setNavn(String navn) {
        this.navn = navn;
    }
}

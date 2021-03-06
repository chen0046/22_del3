public class Spiller {
    String navn;
    Konto spillerKonto = new Konto();
    int pos;
    int spillerID;
    boolean inJail;
    boolean hasJailCard;

    public boolean isHasJailCard() {
        return hasJailCard;
    }

    public void setHasJailCard(boolean hasJailCard) {
        this.hasJailCard = hasJailCard;
    }

    public boolean isInJail() {
        return inJail;
    }

    public void setInJail(boolean inJail) {
        this.inJail = inJail;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
        if(pos > 23) {
            this.pos = getPos() - 24;
            spillerKonto.setBalance(+ 2);
        }
    }

    public int getSpillerID() {
        return spillerID;
    }

    public void setSpillerID(int spillerID) {
        this.spillerID = spillerID;
    }
    /* Her sørger vi for at når "askname" bliver kaldt på i andre klasser, så bliver det næste input spilleren laver
    det navnet bliver sat til */

    //Her gør vi så når man skriver getNavn så får man det definerede Navn
    public String getNavn() {
        return navn;
    }

    //Her gør vi så når man skriver setNavn så definerer vi navnet
    public void setNavn(String navn) {
        this.navn = navn;
    }
}

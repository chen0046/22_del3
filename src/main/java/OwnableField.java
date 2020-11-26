public class OwnableField extends Field{
    int pris;
    int ejer;
    int husleje;

    public OwnableField(int pris, int husleje) {
        super();
        this.pris = pris;
        this.husleje = husleje;
        this.ejer = -1;
    }

    public int getPris() {
        return pris;
    }

    public int getEjer() {
        return ejer;
    }

    public void setEjer(int ejer) {
        this.ejer = ejer;
    }

    public int getHusleje() {
        return husleje;
    }

    public void setHusleje(int husleje) {
        this.husleje = husleje;
    }
}
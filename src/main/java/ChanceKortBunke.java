public class ChanceKortBunke {
    Chancekort[] bunke;
    String T;
    int ID;
    int topKort;

    public ChanceKortBunke() {
        setTopKort(0);
        bunke = new Chancekort[16];
        bunke[0] = new Chancekort("Du har modtaget chancekortet:\nRyk frem til START. modtag M2", 1);
        bunke[1] = new Chancekort("Du har modtaget chancekortet:\nRyk op til 5 felter frem!", 2);
        bunke[2] = new Chancekort("Du har modtaget chancekortet:\nGRATIS FELT! Ryk frem et orange felt hvis det er ledigt får du det gratis eller skal du betale leje til ejeren", 3);
        bunke[3] = new Chancekort("Du har modtaget chancekortet:\nGRATIS FELT! Ryk frem til et mørkegrønt eller gult felt. Hvis det er ledigt, får du det GRATIS! Ellers skal du BETALE leje til ejeren.", 4);
        bunke[4] = new Chancekort("Du har modtaget chancekortet:\nRyk 1 felt frem, eller tag et chancekort mere.", 5);
        bunke[5] = new Chancekort("Du har modtaget chancekortet:\nDu har spist for meget slik. BETAL M2 til banken", 6);
        bunke[6] = new Chancekort("Du har modtaget chancekortet:\nGRATIS FELT! Ryk frem til et orange eller grønt felt. Hvis det er ledigt, får du et GRATIS! Ellers skal BETALE leje til ejeren.", 7);
        bunke[7] = new Chancekort("Du har modtaget chancekortet:\nGRATIS FELT! Ryk frem til et lyseblåt felt. Hvis det er ledigt, får du det GRATIS! Ellers skal du BETALE leje til ejeren.", 8);
        bunke[8] = new Chancekort("Du har modtaget chancekortet:\nDu løslades uden omkostninger. Behold dette kort, indtil du får brug for det.", 9);
        bunke[9] = new Chancekort("Du har modtaget chancekortet:\nRyk frem til Strandpromenaden.", 10);
        bunke[10] = new Chancekort("Du har modtaget chancekortet:\nDet er din fødselsdag! alle giver dig M1. TILLYKKE MED FØDSELSDAGEN!", 11);
        bunke[11] = new Chancekort("Du har modtaget chancekortet:\nGRATIS FELT! Ryk frem til et pink eller mørkeblåt felt. Hvis det er ledigt, får du det GRATIS! Ellers skal du BETALE leje til ejeren.", 12);
        bunke[12] = new Chancekort("Du har modtaget chancekortet:\nDu har lavet alle dine lektier MODTAG M2 fra banken.", 13);
        bunke[13] = new Chancekort("Du har modtaget chancekortet:\nGRATIS FELT! Ryk frem til et rødt felt. Hvis det er ledigt, får du det GRATIS! Ellers skal du BETALE leje til ejeren.", 14);
        bunke[14] = new Chancekort("Du har modtaget chancekortet:\nGRATIS FELT! Ryk frem til Skaterparken for at lave det perfekte grind! Hvis ingen ejer den, får du den GRATIS! Ellers skal du BETALE leje til ejeren.", 15);
        bunke[15] = new Chancekort("Du har modtaget chancekortet:\nGRATIS FELT! Ryk frem til et lyseblåt eller rødt felt. Hvis det er ledigt, får du det GRATIS! Ellers skal du BETALE leje til ejeren.", 16);

        træk();
    }

    public void træk() { //returnerer kort tekst og kort ID og vælger det første kort i bunken og sætter et nyt topkort
        this.T = bunke[getTopKort()].kortTekst;
        this.ID = bunke[getTopKort()].kortID;
        setTopKort(getTopKort() + 1);
    }

    public String hentT() {return T; }
    public int hentID() {return ID; }

    public void bland() {
        int t = 0;
        while(t < 1000) { //blander alle kortene 1000 gange
            int i = (int) (Math.random() * 15);
            int j = (int) (Math.random() * 15);

            Chancekort e = bunke[i];
            Chancekort f = bunke[j];

            bunke[i] = f;
            bunke[j] = e;
            t++;
        }
    }

    public int getTopKort() {
        return topKort;
    }

    public void setTopKort(int topKort) {
        this.topKort = topKort;
        if(topKort > 15) {
            setTopKort(getTopKort() - 16);
        }
    }
}

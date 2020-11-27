public class Terning {
    int terning1;  //Første terning


    public Terning() {   //roll funktion
        roll();
    }

    public void roll() {  //returnerer tal mellem 1-6
        terning1 = (int) (Math.random() * 6 + 1);

    }

    public int henttotal() { //Giv et resultat for de 2 terninger lagt sammen
        return terning1;
    }




}


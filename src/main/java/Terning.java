public class Terning {
    int terning1;  //Første terning


    public Terning() {   //roll funktion
        roll();
    }

    public void roll() {  /*Vi får roll funktionen til at sørge for at hver terning giver os et tilfældigt
        tal mellem 1-6 for hver gang vi roller. Det er også nemt at ændre værdien af terningen
        og det er også nemt at sørge for at hver terning har et vidst antal øjne*/
        terning1 = (int) (Math.random() * 6 + 1);

    }

    public int henttotal() { //Giv et resultat for de 2 terninger lagt sammen
        return terning1;
    }




}


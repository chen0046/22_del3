import gui_fields.GUI_Player;

import java.util.Scanner;

public class Spiller {
    private String name;
    private Konto konto;

    public Spiller(String name, Konto konto) {
        this.name = name;
        this.konto = konto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Konto getKonto() {
        return konto;
    }


    /*String navn; //Navn skal defineres som String da det involverer tekst
    Scanner input = new Scanner(System.in); //Vi tilføjer Scanneren så vi kan modtage inputs fra spilleren
    Konto spillerKonto;
    int pos;
    int Birthday; */




    /*
    Her sørger vi for at når "askname" bliver kaldt på i andre klasser, så bliver det næste input spilleren laver
    det navnet bliver sat til */

    //Her gør vi så når man skriver getNavn så får man det definerede Navn
    /*public String getNavn() {
        return navn;
    }

    //Her gør vi så når man skriver setNavn så definerer vi navnet
    public void setNavn(String navn) {
        this.navn = navn;
    }*/
}

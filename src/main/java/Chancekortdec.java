import java.util.ArrayList;

public class Chancekortdec {

    public void byt(String[] a) {

        //her opretter jeg tallene til at trække dem ud senere
        int i= (int)(Math.random()*20);
        int j= (int)(Math.random()*20);

        //trække kort i og j ud
        String e= a[i];
        String f= a[j];

        //placere j på i`s plads og omvendt
         a[i]=f;
         a[j]=e;


    }
    public Chancekortdec() {

        String[] bunke = new String[20];
            bunke[0]=("På din næste tur skal du drøne frem til et hvilket som helst ledigt felt og købe det. Hvis der ikke er nogen ledige felter, skal du købe et fra en anden spiller!");
            bunke[2]=("Ryk frem til START. modtag m2");
            bunke[3]=("Ryk op til 5 felter frem.");
            bunke[4]=("Ryk frem til et orange felt. Hvis det er ledigt, får du det GRATIS! Ellers skal du BETALE leje til ejeren.");
            bunke[5]=("Ryk 1 felt frem, eller tag et chancekort mere.");
            bunke[6]=("Giv dette kort til SKIBET, og tag et chancekort mere. SKIB: På din næste tur skal du sejle frem til et hvilket som helst ledigt felt og købe det. Hvis der ikke nogen ledige felter, skal du købe et fra en anden spiller!");
            bunke[7]=("Du har spist for meget slik. BETAL M2 banken");
            bunke[8]=("GRATIS FELT! Ryk frem til et orange eller grønt felt. Hvis det er ledigt, får du et GRATIS! Ellers skal BETALE leje til ejeren.");
            bunke[9]=("GRATIS FELT! Ryk frem til et lyseblåt felt. Hvis det er ledigt, får du det GRATIS! Ellers skal du BETALE leje til ejeren.");
            bunke[10]=("Du løslades uden omkostninger. Behold dette kort, indtil du får brug for det.");
            bunke[11]=("Ryk frem til Strandpromenaden.");
            bunke[12]=("Giv dette kort til KATTEN, og tag et chancekort mere. KAT: på din næste tur skal du liste dig hen på et hvilket som helst ledigt felt og købe det. Hvis der ikke er nogen ledige felter, skal du købe et fra en anden spiller!");
            bunke[13]=("Giv dette kort til Raketten, og tag et chancekort mere. Raket: På din næste tur skal du hoppe hen på et hvilket som helst ledigt felt og købe det. Hvis der ikke er nogen ledige felter, skal du købe et fra en anden spiller!");
            bunke[14]=("Det er din fødselsdag! alle giver dig M1. TILLYKKE MED FØDSELSDAGEN!");
            bunke[15]=("GRATIS FELT! Ryk frem til et pink eller mørkeblåt felt. Hvis det er ledigt, får du det GRATIS! Ellers skal du BETALE leje til ejeren.");
            bunke[16]=("Du har lavet alle dine lektier MODTAG M2 fra banken.");
            bunke[17]=("GRATIS FELT! Ryk frem til et rødt felt. Hvis det er ledigt, får du det GRATIS! Ellers skal du BETALE leje til ejeren.");
            bunke[18]=("GRATIS FELT! Ryk frem til Skaterparken for at lave det perfekte grind! Hvis ingen ejer den, får du den GRATIS! Ellers skal du BETALE leje til ejeren.");
            bunke[19]=("GRATIS FELT! Ryk frem til et lyseblåt eller rødt felt. Hvis det er ledigt, får du det GRATIS! Ellers skal du BETALE leje til ejeren.");
            bunke[1]=("GRATIS FELT! Ryk frem til et brunt eller gult felt. Hvis det er ledigt, får du det GRATIS! Ellers skal du BETALE leje til ejeren.");


        int antalKort = bunke.length;

        for (int i = 1; i <1000 ; i++) {

            byt(bunke);

        }

    }

}

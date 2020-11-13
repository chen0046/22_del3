import gui_fields.*;
import gui_main.GUI;
import java.awt.*;

public class Fields {

    public void makeFields() {
        GUI_Field[] fields = {
                new GUI_Start("Start", "Modtag 2 moneter", "Modtag 2 moneter,-\nnår de passerer start", Color.RED, Color.BLACK),
                new GUI_Street("Burgerbaren", "Pris: 1 monet.", "Den lokale burgerbar er en favorit i lokalområdet", "Denne koster 1 monet", Color.RED, Color.white),
                new GUI_Street("Pizzahuset", "Pris: 1 monet", "Burgerbarens nemesis", "Denne koster 1 monet", Color.RED, Color.white),
                new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK),
                new GUI_Street("Slikbutikken", "Pris: 1 monet", "Skal du munkes?", "1 monet mester jakel", Color.BLUE, Color.WHITE),
                new GUI_Street("Iskiosken", "Iskiosken", "Denne koster 1 monet.", "1 monet", Color.BLUE, Color.white),
                new GUI_Jail("default", "Fængsel", "Fængsel", "På besøg i fængslet", new Color(125, 125, 125), Color.BLACK),
                new GUI_Street("Museet", "Museet", "Det flotte museum", "2 moneter i leje", Color.PINK, Color.white),
                new GUI_Street("Biblioteket", "Pris: 2 moneter", "Kilden til al viden", "2 moneter", Color.PINK, Color.white),
                new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK),
                new GUI_Street("Skaterparken", "Pris: 2 moneter", "Dér hvor alle de seje drenge er", "2 moneter", Color.YELLOW, Color.BLACK),
                new GUI_Street("Svømmingpoolen", "Pris: 2 moneter", "Det perfekte sted at slappe af", "2 moneter", Color.YELLOW, Color.BLACK),
                new GUI_Refuge("default", "Gratis Parkeing", "", "Enhver billists drøm", Color.WHITE, Color.BLACK),
                new GUI_Street("Spillehallen", "Pris: 3 moneter", "Skal vi tage et spil Streetfighter?", "2 moneter", Color.red, Color.white),
                new GUI_Street("Biografen", "Pris: 3 moneter", "Det perfekte sted at se Beemovie", "3 moneter", Color.red, Color.white),
                new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK),
                new GUI_Street("Legetøjsbutikken", "Pris: 3 moneter", "Ved du hvad det bedste er?", "3 moneter", Color.orange, Color.BLACK),
                new GUI_Street("Dyrehandlen", "Pris: 3 moneter", "Er det ikke tid til at få en hund?", "3 moneter", Color.orange, Color.BLACK),
                new GUI_Jail("default", "Gå i fængsel", "Gå i fængsel", "De fængsles\nSlå to ens for at komme ud", new Color(125, 125, 125), Color.BLACK),
                new GUI_Street("Bowlinghallen", "Pris: 4 moneter", "STRIKE!", "4 moneter", Color.GREEN, Color.BLACK),
                new GUI_Street("Zoologisk have", "Pris: 4 moneter", "Hvor du kan se alt fra isbjørne til løver", "4 moneter", Color.GREEN, Color.BLACK),
                new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK),
                new GUI_Street("Vandlandet", "Pris: 5 moneter", "Hvor sjov og vand bliver et", "5 moneter", Color.BLUE, Color.white),
                new GUI_Street("Strandpromenaden", "Pris: 5 moneter", "Det perfekte sted at få sig en bid mad", "5 moneter", Color.BLUE, Color.white)
        };
        GUI gui = new GUI(fields);


    }

}

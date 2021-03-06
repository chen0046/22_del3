import java.awt.*;

public class Board {
    Field[] fields;

    public Board() {
        fields = new Field[24];
        for (int i = 0; i < 24; i++) {
            fields[i] = new Field();
        }
    }
    public void setFields(Field[] fields) {
        this.fields = fields;
        fields[0].setTitle("Start"); fields[0].setSubText("Modtag 2 moneter."); fields[0].setDescription("Start"); fields[0].setStart(true);
        fields[1].setTitle("Burgerbar\n"); fields[1].setOwnable(true); fields[1].setSubText("M1"); fields[1].setDescription("Du står ved den mega lækre burgerbar,den koster M1 både at købe og leje."); fields[1].setMain(Color.black); fields[1].setSecondary(new Color(102,153,0));
        fields[2].setTitle("Pizzahuset\n"); fields[2].setOwnable(true); fields[2].setSubText("M1"); fields[2].setDescription("Den dejlige duft af pizza tiltrækker dig. Pizzahuset koster M1 at købe og leje"); fields[2].setMain(Color.black); fields[2].setSecondary(new Color(102,153,0));
        fields[3].setChance(true);
        fields[4].setTitle("Slikbutikken\n"); fields[4].setOwnable(true); fields[4].setSubText("M1"); fields[4].setDescription("Du elsker vingummier og beslutter at du vil ege den. Slikbutikken koster M1 at købe og leje."); fields[4].setMain(Color.black); fields[4].setSecondary(new Color(51, 153, 255));
        fields[5].setTitle("Iskiosken\n"); fields[5].setOwnable(true); fields[5].setSubText("M1"); fields[5].setDescription("Du har fået en genial idé til en ny issmag. Isbutikken koster M1 at købe og leje."); fields[5].setMain(Color.black); fields[5].setSecondary(new Color(51, 153, 255));
        fields[6].setJail(true);
        fields[7].setTitle("Museet\n"); fields[7].setOwnable(true); fields[7].setSubText("M2"); fields[7].setDescription("Alle de gamme ting, som er blevet fundet igennem tiden ligger gemt inde på museumet. Du er meget glad for gamle ting og kan købe eller leje museet for M2."); fields[7].setMain(Color.black); fields[7].setSecondary(new Color(153, 51, 102));
        fields[8].setTitle("Bibliotek\n"); fields[8].setOwnable(true);fields[8].setSubText("M2"); fields[8].setDescription("Du er nået frem til biblioteket og kan nu låne de nyeste bøger. Det koster M2 at købe og leje biblioteket"); fields[8].setMain(Color.black); fields[8].setSecondary(new Color(153, 51, 102));
        fields[9].setChance(true);
        fields[10].setTitle("Skaterpark\n"); fields[10].setOwnable(true); fields[10].setSubText("M2"); fields[10].setDescription("Du kommer gående med dine rulleskøjter i hånden og lander på Skaterparkken. Du glæder dig til vise dem frem, Skaterparkken koster M2 at købe og leje.");fields[10].setMain(Color.black); fields[10].setSecondary(new Color(255, 187, 51));
        fields[11].setTitle("Svømmepool\n"); fields[11].setOwnable(true); fields[11].setSubText("M2"); fields[11].setDescription("Du skal prøve din badedregt og er stoppet ved den lokale Svømmingpool. Svømmenpoolen koster M2 at købe og leje");fields[11].setMain(Color.black); fields[11].setSecondary(new Color(255, 187, 51));
        fields[12].setParkering(true);
        fields[13].setTitle("Spillehallen\n"); fields[13].setOwnable(true); fields[13].setSubText("M3"); fields[13].setDescription("Du har lavet alle dine lektier og har fået lov til at gå ned i Spillehallen. Spille hallen koster M3 at købe og leje.");fields[13].setMain(Color.black); fields[13].setSecondary(new Color(204, 0, 0));
        fields[14].setTitle("Biografen\n"); fields[14].setOwnable(true); fields[14].setSubText("M3"); fields[14].setDescription("Der er kommet en ny mega god film i biografen, og har valgt at prøve at få fat i en billet. Biografen koster M3 at købe og leje.");fields[14].setMain(Color.black); fields[14].setSecondary(new Color(204, 0, 0));
        fields[15].setChance(true);
        fields[16].setTitle("Legetøjsbutik\n"); fields[16].setOwnable(true); fields[16].setSubText("M3"); fields[16].setDescription("Det er snart din fødselsdag og du har besluttet at gå i legetøjsbutikken, for at finde noget du kan ønske dig. Legetøjsbutikken koster M at købe og leje.");fields[16].setMain(Color.black); fields[16].setSecondary(new Color(255, 255, 0));
        fields[17].setTitle("Dyrehandel\n"); fields[17].setOwnable(true); fields[17].setSubText("M3"); fields[17].setDescription("Du er endelig blevet stor nok til at få et kæledyr og i Dyrehandlen er den nogen, som kan hjælpe dig med at vælge/ finde et kæledyr. Dyrehandlen koster M3 at købe og leje.");fields[17].setMain(Color.black); fields[17].setSecondary(new Color(255, 255, 0));
        fields[18].setGoToJail(true);
        fields[19].setTitle("Bowlinghal\n"); fields[19].setOwnable(true); fields[19].setSubText("M4"); fields[19].setDescription("Det er fredag og du skal til fest i bowlinghallen, det bliver en mega sjov eftermiddag og du er vild sej til bowling. Bowlinghallen koster M4 at købe og leje.");fields[19].setMain(Color.black); fields[19].setSecondary(new Color(0, 128, 43));
        fields[20].setTitle("Zoo\n"); fields[20].setOwnable(true); fields[20].setSubText("M4"); fields[20].setDescription("Endelig kom den dag hvor du skal i zoo og se alle de fantastiske dyr og sige hej til en ged. Zoo koster M4 at købe og leje.");fields[20].setMain(Color.black); fields[20].setSecondary(new Color(0, 128, 43));
        fields[21].setChance(true);
        fields[22].setTitle("Vandland\n"); fields[22].setOwnable(true); fields[22].setSubText("M5"); fields[22].setDescription("Det er blevet sommer og varmt, derfor vil du gerne i vandlandet, som både har dejligt afkølende vand og sjove vandrutsjebane. Vandlandet koster M5 at købe og leje.");fields[22].setMain(Color.black); fields[22].setSecondary(new Color(51, 102, 153));
        fields[23].setTitle("Strandpromenade\n"); fields[23].setOwnable(true); fields[23].setSubText("M5"); fields[23].setDescription("Sommerferien er startet og din mor har inviteret dig ned til Strandpromenaden for at få en is.Strandpromenaden koster M5 at købe og leje.");fields[23].setMain(Color.black); fields[23].setSecondary(new Color(51, 102, 153));
        }
        public void setOwnableFields(Field[] fields) {
        fields[1] = new OwnableField(1,1);
        fields[2] = new OwnableField(1,1);
        fields[4] = new OwnableField(1,1);
        fields[5] = new OwnableField(1,1);
        fields[7] = new OwnableField(2,2);
        fields[8] = new OwnableField(2,2);
        fields[10] = new OwnableField(2,2);
        fields[11] = new OwnableField(2,2);
        fields[13] = new OwnableField(3,3);
        fields[14] = new OwnableField(3,3);
        fields[16] = new OwnableField(3,3);
        fields[17] = new OwnableField(3,3);
        fields[19] = new OwnableField(4,4);
        fields[20] = new OwnableField(4,4);
        fields[22] = new OwnableField(5,5);
        fields[23] = new OwnableField(5,5);
    }
    public Field[] getFields() {
        return fields;
    }
}


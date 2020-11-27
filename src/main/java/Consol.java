import gui_fields.GUI_Player;
import gui_main.GUI;

public class Consol {
    BoardController boardController = new BoardController();
    GUI gui = new GUI(boardController.getGui_fields());
    Terning terning = new Terning();
    SpillerController spillerController = new SpillerController();

    public void Startgame() {
        while (true) {
            int numberInput = gui.getUserInteger("Hvor mange spiller i dag? I kan spille mellem 2 og 4 spillere.");
            spillerController.makePlayers(numberInput);
            if (numberInput < 2 || numberInput > 4) {
                gui.showMessage("Fejl Der må kun være 2-4 spillere");
            }
            else {
                askName(numberInput);
                break;
            }
        }
    }

    public void askName(int amount) {
        int var = 0;
        while (var < amount) {
            String navn = gui.getUserString("Indtast spillernes navne");
            SpillerController.spillere[var] = new Spiller();
            SpillerController.spillere[var].setNavn(navn);
            SpillerController.spillere[var].setPos(0);
            SpillerController.spillere[var].setSpillerID(var);
            if (amount == 2) {
                SpillerController.spillere[var].spillerKonto.setBalance(20);
            }
            else if (amount == 3) {
                SpillerController.spillere[var].spillerKonto.setBalance(18);
            }
            else if (amount == 4){
                SpillerController.spillere[var].spillerKonto.setBalance(16);
            }
            spillerController.gui_players[var] = new GUI_Player(SpillerController.spillere[var].getNavn(), SpillerController.spillere[var].spillerKonto.getBalance());
            gui.addPlayer(spillerController.getGui_players()[var]);
            gui.getFields()[SpillerController.spillere[var].getPos()].setCar(spillerController.getGui_players()[var], true);
            var++;
        }
    }

    public void playGame() {
        int t = 0;
        while (true) {
            if(t > SpillerController.spillere.length - 1) {
                t = 0;
            }
            if(spillerController.getSpillere()[t].isInJail()) {
                if(spillerController.getSpillere()[t].isHasJailCard()) {
                    boolean selection = gui.getUserLeftButtonPressed("Vil du bruge dit 'kom-ud-af-fængselskort'","Brug fængselskort","Betal M1");
                    if (selection){
                        spillerController.getSpillere()[t].setHasJailCard(false);
                    }
                    else {
                        spillerController.getSpillere()[t].spillerKonto.setBalance( -1);
                    }
                }
                else{
                    gui.showMessage("Du er kommet i Fængsel og har ikke noget Kort for at komme fri\n Du betaler M1 for at komme ud");
                    spillerController.getSpillere()[t].spillerKonto.setBalance( -1);
                }
                spillerController.getSpillere()[t].setInJail(false);
            }
            turn(t);
            if(spillerController.getSpillere()[t].spillerKonto.getBalance() < 0) {
                break;
            }
            t++;
        }
    }
    public void turn (int playerindex) {
        boardController.setChanceFelt(false);
        gui.getUserButtonPressed("Det er " + spillerController.getSpillere()[playerindex].getNavn() + "'s tur", "Slå terningen");
        terning.roll();
        gui.setDie(terning.henttotal());
        gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], false);
        spillerController.movePlayer(playerindex, terning.henttotal());
        boardController.playerLandOnField(spillerController.getSpillere()[playerindex], spillerController.getSpillere()[playerindex].getPos());
        gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], true);
        updateView(SpillerController.spillere.length);
        gui.displayChanceCard(boardController.flavorTekst);
        if(boardController.isChanceFelt()) {
            boardControllerSwitch(boardController.bunke.ID,playerindex);
            }
        }

    public void updateView(int amount) {
        int t = 0;
        boardController.getGui_fields();
        while(t < amount){
            spillerController.gui_players[t].setBalance(spillerController.getSpillere()[t].spillerKonto.getBalance());
            t++;
        }
    }

    public void endGame() {
        spillerController.sortPLayers();
        if (spillerController.getSpillere()[spillerController.getSpillere().length - 1].spillerKonto.getBalance() == spillerController.getSpillere()[spillerController.getSpillere().length - 2].spillerKonto.getBalance()) {
            gui.displayChanceCard("Taberen er fundet! Det blev: " + spillerController.getSpillere()[0].getNavn() + "\nDet blev en delt sejr til: " + spillerController.getSpillere()[spillerController.getSpillere().length - 1].getNavn() + "og " + spillerController.getSpillere()[spillerController.getSpillere().length - 2].getNavn());
        }
        gui.displayChanceCard("Taberen er fundet! Det blev: " + spillerController.getSpillere()[0].getNavn() + "\nVinderen er: " + spillerController.getSpillere()[spillerController.getSpillere().length - 1].getNavn());
    }

    public void boardControllerSwitch(int ID,int playerindex){
    switch (ID) {
    case 1:
        gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], false);
        spillerController.getSpillere()[playerindex].setPos(0);
        gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], true);
        spillerController.getSpillere()[playerindex].spillerKonto.setBalance(+2);
        boardController.setChanceFelt(false);
        break;
    case 2:
        int valg = gui.getUserInteger("Hvor mange felter vil du rykke frem?", 1, 5);
        while (valg < 1 || valg > 5) {
            valg = gui.getUserInteger("Der blev sagt 1-5.");
        }
        gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], false);
        spillerController.movePlayer(playerindex, valg);
        boardController.playerLandOnField(spillerController.getSpillere()[playerindex], spillerController.getSpillere()[playerindex].getPos());
        gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], true);
        gui.displayChanceCard(boardController.flavorTekst);
        boardController.setChanceFelt(false);
        break;
    case 3:
        boolean selection = gui.getUserLeftButtonPressed("Vælg et orange felt", "Skaterpark", "Svømmepool");
        if (selection) {
            gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], false);
            boardController.playerLandOnFieldFree(spillerController.getSpillere()[playerindex], 10);
            spillerController.getSpillere()[playerindex].setPos(10);
            gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], true);
            gui.displayChanceCard(boardController.flavorTekst);
        } else {
            gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], false);
            boardController.playerLandOnFieldFree(spillerController.getSpillere()[playerindex], 11);
            spillerController.getSpillere()[playerindex].setPos(11);
            gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], true);
            gui.displayChanceCard(boardController.flavorTekst);
        }
        boardController.setChanceFelt(false);
        break;
    case 4:
        String chosenElement = gui.getUserSelection(
                "Vælg mellem følende: ",
                "Burgerbar", "Pizzahuset", "Legetøjsbutik", "Dyrehandel"
        );
        switch (chosenElement) {
            case "Burgerbar":
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], false);
                boardController.playerLandOnFieldFree(spillerController.getSpillere()[playerindex], 1);
                spillerController.getSpillere()[playerindex].setPos(1);
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], true);
                gui.displayChanceCard(boardController.flavorTekst);
                break;
            case "Pizzahuset":
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], false);
                boardController.playerLandOnFieldFree(spillerController.getSpillere()[playerindex], 2);
                spillerController.getSpillere()[playerindex].setPos(2);
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], true);
                gui.displayChanceCard(boardController.flavorTekst);
                break;
            case "Legetøjsbutik":
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], false);
                boardController.playerLandOnFieldFree(spillerController.getSpillere()[playerindex], 16);
                spillerController.getSpillere()[playerindex].setPos(16);
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], true);
                gui.displayChanceCard(boardController.flavorTekst);
                break;
            case "Dyrehandel":
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], false);
                boardController.playerLandOnFieldFree(spillerController.getSpillere()[playerindex], 17);
                spillerController.getSpillere()[playerindex].setPos(17);
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], true);
                gui.displayChanceCard(boardController.flavorTekst);
                break;
        }
        boardController.setChanceFelt(false);
        break;
    case 5:
        boolean selection2 = gui.getUserLeftButtonPressed("Vil du rykke 1 frem eller tage et nyt chancekort", "1 frem", "Nyt chancekort");
        if (selection2) {
            gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], false);
            spillerController.movePlayer(playerindex, 1);
            boardController.playerLandOnField(spillerController.getSpillere()[playerindex], spillerController.getSpillere()[playerindex].getPos());
            gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], true);
            gui.displayChanceCard(boardController.flavorTekst);
            boardController.setChanceFelt(false);
        } else {
            boardController.playerLandOnField(spillerController.getSpillere()[playerindex], spillerController.getSpillere()[playerindex].getPos());
            updateView(SpillerController.spillere.length);
            gui.displayChanceCard(boardController.flavorTekst);
            boardControllerSwitch(boardController.bunke.ID,playerindex);
        }
        break;
    case 6:
        spillerController.getSpillere()[playerindex].spillerKonto.setBalance(-2);
        boardController.setChanceFelt(false);
        break;
    case 7:
        String chosenElement2 = gui.getUserSelection(
                "Vælg mellem følende: ",
                "Skaterpark", "Svømmepool", "Bowlinghal", "Zoo"
        );
        switch (chosenElement2) {
            case "Skaterpark":
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], false);
                boardController.playerLandOnFieldFree(spillerController.getSpillere()[playerindex], 10);
                spillerController.getSpillere()[playerindex].setPos(10);
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], true);
                gui.displayChanceCard(boardController.flavorTekst);
                break;
            case "Svømmepool":
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], false);
                boardController.playerLandOnFieldFree(spillerController.getSpillere()[playerindex], 11);
                spillerController.getSpillere()[playerindex].setPos(11);
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], true);
                gui.displayChanceCard(boardController.flavorTekst);
                break;
            case "Bowlinghal":
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], false);
                boardController.playerLandOnFieldFree(spillerController.getSpillere()[playerindex], 19);
                spillerController.getSpillere()[playerindex].setPos(19);
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], true);
                gui.displayChanceCard(boardController.flavorTekst);
                break;
            case "Zoo":
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], false);
                boardController.playerLandOnFieldFree(spillerController.getSpillere()[playerindex], 20);
                spillerController.getSpillere()[playerindex].setPos(20);
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], true);
                gui.displayChanceCard(boardController.flavorTekst);
                break;
        }
        boardController.setChanceFelt(false);
        break;
    case 8:
        boolean selection3 = gui.getUserLeftButtonPressed("Vælg et lyseblåt felt", "Slikbutikken", "Iskiosken");
        if (selection3) {
            gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], false);
            boardController.playerLandOnFieldFree(spillerController.getSpillere()[playerindex], 4);
            spillerController.getSpillere()[playerindex].setPos(4);
            gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], true);
            gui.displayChanceCard(boardController.flavorTekst);
        } else {
            gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], false);
            boardController.playerLandOnFieldFree(spillerController.getSpillere()[playerindex], 5);
            spillerController.getSpillere()[playerindex].setPos(5);
            gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], true);
            gui.displayChanceCard(boardController.flavorTekst);
        }
        boardController.setChanceFelt(false);
        break;
    case 9:
        spillerController.getSpillere()[playerindex].setHasJailCard(true);
        boardController.setChanceFelt(false);
        break;
    case 10:
        gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], false);
        boardController.playerLandOnField(spillerController.getSpillere()[playerindex], 23);
        spillerController.getSpillere()[playerindex].setPos(23);
        gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], true);
        gui.displayChanceCard(boardController.flavorTekst);
        boardController.setChanceFelt(false);
        break;
    case 11:
        int i = 0;
        while (i < spillerController.getSpillere().length) {
            spillerController.getSpillere()[playerindex].spillerKonto.setBalance(-1);
            i++;
        }
        spillerController.getSpillere()[playerindex].spillerKonto.setBalance(+ spillerController.getSpillere().length);
        boardController.setChanceFelt(false);
        break;
    case 12:
        String chosenElement3 = gui.getUserSelection(
                "Vælg mellem følende: ",
                "Museet", "Bibliotek", "Vandland", "Strandpromonade"
        );
        switch (chosenElement3) {
            case "Museet":
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], false);
                boardController.playerLandOnFieldFree(spillerController.getSpillere()[playerindex], 7);
                spillerController.getSpillere()[playerindex].setPos(7);
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], true);
                gui.displayChanceCard(boardController.flavorTekst);
                break;
            case "Bibliotek":
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], false);
                boardController.playerLandOnFieldFree(spillerController.getSpillere()[playerindex], 8);
                spillerController.getSpillere()[playerindex].setPos(8);
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], true);
                gui.displayChanceCard(boardController.flavorTekst);
                break;
            case "Vandland":
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], false);
                boardController.playerLandOnFieldFree(spillerController.getSpillere()[playerindex], 22);
                spillerController.getSpillere()[playerindex].setPos(22);
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], true);
                gui.displayChanceCard(boardController.flavorTekst);
                break;
            case "Strandpromonade":
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], false);
                boardController.playerLandOnFieldFree(spillerController.getSpillere()[playerindex], 23);
                spillerController.getSpillere()[playerindex].setPos(23);
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], true);
                gui.displayChanceCard(boardController.flavorTekst);
                break;
        }
        boardController.setChanceFelt(false);
        break;
    case 13:
        spillerController.getSpillere()[playerindex].spillerKonto.setBalance(+2);
        boardController.setChanceFelt(false);
        break;
    case 14:
        boolean selection4 = gui.getUserLeftButtonPressed("Vælg et rødt felt", "Spillehallen", "Biografen");
        if (selection4) {
            gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], false);
            boardController.playerLandOnFieldFree(spillerController.getSpillere()[playerindex], 13);
            spillerController.getSpillere()[playerindex].setPos(13);
            gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], true);
            gui.displayChanceCard(boardController.flavorTekst);
        } else {
            gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], false);
            boardController.playerLandOnFieldFree(spillerController.getSpillere()[playerindex], 14);
            spillerController.getSpillere()[playerindex].setPos(14);
            gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], true);
            gui.displayChanceCard(boardController.flavorTekst);
        }
        boardController.setChanceFelt(false);
        break;
    case 15:
        gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], false);
        boardController.playerLandOnFieldFree(spillerController.getSpillere()[playerindex], 10);
        spillerController.getSpillere()[playerindex].setPos(10);
        gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], true);
        gui.displayChanceCard(boardController.flavorTekst);
        boardController.setChanceFelt(false);
        break;
    case 16:
        String chosenElement4 = gui.getUserSelection(
                "Vælg mellem følende: ",
                "Slikbutikken", "Iskiosken", "Spillehallen", "Biografen"
        );
        switch (chosenElement4) {
            case "Slikbutikken":
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], false);
                boardController.playerLandOnFieldFree(spillerController.getSpillere()[playerindex], 4);
                spillerController.getSpillere()[playerindex].setPos(4);
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], true);
                gui.displayChanceCard(boardController.flavorTekst);
                break;
            case "Iskiosken":
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], false);
                boardController.playerLandOnFieldFree(spillerController.getSpillere()[playerindex], 5);
                spillerController.getSpillere()[playerindex].setPos(5);
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], true);
                gui.displayChanceCard(boardController.flavorTekst);
                break;
            case "Spillehallen":
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], false);
                boardController.playerLandOnFieldFree(spillerController.getSpillere()[playerindex], 13);
                spillerController.getSpillere()[playerindex].setPos(13);
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], true);
                gui.displayChanceCard(boardController.flavorTekst);
                break;
            case "Biografen":
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], false);
                boardController.playerLandOnFieldFree(spillerController.getSpillere()[playerindex], 14);
                spillerController.getSpillere()[playerindex].setPos(14);
                gui.getFields()[SpillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], true);
                gui.displayChanceCard(boardController.flavorTekst);
                break;
        }
        boardController.setChanceFelt(false);
        break;
    }
    }
}
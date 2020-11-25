import gui_fields.GUI_Player;
import gui_main.GUI;

public class Consol {
    BoardController boardController = new BoardController();
    GUI gui = new GUI(boardController.getGui_fields());
    Terning terning = new Terning();
    SpillerController spillerController = new SpillerController();

    public void Startgame() {
        int numberInput = gui.getUserInteger("Hvor mange spiller i dag? I kan spille mellem 2 og 4 spillere.");
        spillerController.makePlayers(numberInput);
        askName(numberInput);
    }


    public void askName(int amount) {
        int var = 0;
        while (var < amount) {
            String navn = gui.getUserString("Indtast spillernes navne");
            spillerController.spillere[var] = new Spiller();
            spillerController.spillere[var].setNavn(navn);
            spillerController.spillere[var].setPos(0);
            spillerController.spillere[var].setSpillerID(var);
            if (amount == 2) {
                spillerController.spillere[var].spillerKonto.setBalance(20);
            }
            else if (amount == 3) {
                spillerController.spillere[var].spillerKonto.setBalance(18);
            }
            else if (amount == 4){
                spillerController.spillere[var].spillerKonto.setBalance(16);
            }
            else {

            }
            spillerController.gui_players[var] = new GUI_Player(spillerController.spillere[var].getNavn(), spillerController.spillere[var].spillerKonto.getBalance());
            gui.addPlayer(spillerController.getGui_players()[var]);
            gui.getFields()[spillerController.spillere[var].getPos()].setCar(spillerController.getGui_players()[var], true);
            var++;

        }
    }

    public void playGame() {
        int t = 0;
        while (true) {
            if(t > spillerController.spillere.length - 1) {
                t = 0;
            }
            turn(t);
            t++;

        }
    }
    public void turn (int playerindex) {
        gui.getUserButtonPressed("hej", "Slå terningen");
        terning.roll();
        gui.setDie(terning.henttotal());
        gui.getFields()[spillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], false);
        spillerController.movePlayer(playerindex, terning.henttotal());
        boardController.playerLandOnField(spillerController.getSpillere()[playerindex], spillerController.getSpillere()[playerindex].getPos());
        gui.getFields()[spillerController.spillere[playerindex].getPos()].setCar(spillerController.getGui_players()[playerindex], true);
        updateAccountView(spillerController.spillere.length);
    }
    public void updateAccountView(int amount) {
        int t = 0;
        while(t < amount){
            spillerController.gui_players[t].setBalance(spillerController.getSpillere()[t].spillerKonto.getBalance());
            t++;
        }

    }
}



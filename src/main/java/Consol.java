import gui_fields.GUI_Player;
import gui_main.GUI;

public class Consol {
    BoardController boardController = new BoardController();
    GUI gui = new GUI(boardController.getGui_fields());
    Terning terning = new Terning();
    SpillerController spillerController = new SpillerController();
    int numberInput;

    public void Startgame() {
        int numberInput = gui.getUserInteger("Hvor mange spiller i dag?");
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
            if (amount == 2) {
                spillerController.spillere[var].spillerKonto.setBalance(20);
            } else if (amount == 3) {
                spillerController.spillere[var].spillerKonto.setBalance(18);
            } else {
                spillerController.spillere[var].spillerKonto.setBalance(16);
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
            gui.getUserButtonPressed("hej", "Slå terningen");
            terning.roll();
            gui.setDie(terning.henttotal());
            gui.getFields()[spillerController.spillere[t].getPos()].setCar(spillerController.getGui_players()[t], false);
            spillerController.movePlayer(t, terning.henttotal());
            gui.getFields()[spillerController.spillere[t].getPos()].setCar(spillerController.getGui_players()[t], true);
            t++;

        }
    }
}



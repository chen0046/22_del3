import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;

public class SpillerController {

    Spiller[] spillere;
    int spillerAntal = 2;
    GUI_Player[] gui_players;


    public SpillerController() {
        spillere = new Spiller[spillerAntal];
        gui_players = new GUI_Player[spillerAntal];
    }


    public Spiller[] getSpillere() {
        return spillere;
    }

    public void setSpillere() {
        int var = 0;
        while(var < spillerAntal) {
            spillere[var] = new Spiller();
            spillere[var].setNavn("Kurt");
            spillere[var].spillerKonto.setBalance(20);
            var++;
        }
    }

    public void setGui_players() {
        int var2 = 0;
        while(var2 < spillerAntal) {
            gui_players[var2] = new GUI_Player(spillere[var2].getNavn(), spillere[var2].spillerKonto.getBalance());
            var2++;
        }
    }

    public GUI_Player[] getGui_players() {
        return gui_players;
    }

    public void move(int playerIndex, int roll) {

    }
}



import gui_fields.GUI_Player;
import gui_main.GUI;
import java.util.Arrays;
import java.util.Collections;

public class SpillerController {

    static Spiller[] spillere;
    GUI_Player[] gui_players;


    public SpillerController() {

    }


    public Spiller[] getSpillere () {
            return spillere;
        }

    public GUI_Player[] getGui_players () {
            return gui_players;
        }

    public void makePlayers(int amount) {
        this.spillere = new Spiller[amount];
        this.gui_players = new GUI_Player[amount];
    }

    public void movePlayer(int playerIndex, int roll) {
        spillere[playerIndex].setPos(spillere[playerIndex].getPos() + roll);

    }
    public void makeTestPlayers(int amount) {
        this.spillere = new Spiller[amount];
    }
}

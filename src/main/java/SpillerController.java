import gui_fields.GUI_Player;

public class SpillerController {

    static Spiller[] spillere;
    GUI_Player[] gui_players;


    public SpillerController() { }


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

    public void sortPLayers() {
        int i2;
        int j;
        Spiller temp;
        for (i2 = 0; i2 < getSpillere().length -1; i2++) {
            for (j = i2+1; j < getSpillere().length; j++) {
                if (getSpillere()[i2].spillerKonto.getBalance() > getSpillere()[j].spillerKonto.getBalance()) {
                    temp = getSpillere()[i2];
                    getSpillere()[i2] = getSpillere()[j];
                    getSpillere()[j] = temp;

                }
            }
        }
        int i3 = 0;
        while(i3 < getSpillere().length) {
            System.out.println(getSpillere()[i3].spillerKonto.getBalance());
            i3++;
        }
    }
    }

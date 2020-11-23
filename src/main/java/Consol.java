import gui_main.GUI;

public class Consol {
    BoardController boardController = new BoardController();
    GUI gui = new GUI(boardController.getGui_fields());
    Terning terning = new Terning();
    SpillerController spillerController = new SpillerController();

    public void Startgame(){
        while(true) {
            spillerController.startSpillere();
            gui.addPlayer(spillerController.getGui_players()[0]);
            gui.addPlayer(spillerController.getGui_players()[1]);
            gui.getFields()[spillerController.spillere[0].getPos()].setCar(spillerController.getGui_players()[0], true);
            gui.getFields()[spillerController.spillere[0].getPos()].setCar(spillerController.getGui_players()[1], true);
            gui.getUserButtonPressed("hej","Slå terningen");
            terning.roll();
            gui.setDie(terning.henttotal());
            spillerController.move(0, terning.henttotal());
        }
    }

    public void setGame() {
        int numberInput = gui.getUserInteger("Hej. Hvor mange spillere er I?");
        spillerController.spillerAntal = numberInput;
        int q = 0;
        while(q < spillerController.spillerAntal) {
            String stringInput = gui.getUserString("Indtast jeres navne en af gangen.");
            spillerController.spillere[q].setNavn(stringInput);
            q++;
        }
    }
}

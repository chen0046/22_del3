import gui_fields.GUI_Player;
import gui_main.GUI;

public class Klasser {
    public static void main(String[] args) {
        BoardController boardController = new BoardController();
        SpillerController spillerController = new SpillerController();
        GUI gui = new GUI(boardController.getGui_fields());
        spillerController.setSpillere();
        spillerController.setGui_players();
        gui.addPlayer(spillerController.getGui_players()[0]);
        boardController.getGui_fields()[10].setCar(spillerController.getGui_players()[0], true);
    }
}

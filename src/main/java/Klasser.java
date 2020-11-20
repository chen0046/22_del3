import gui_main.GUI;

public class Klasser {
    public static void main(String[] args) {
       // Fields game = new Fields();
       // game.makeFields();
        BoardController boardController = new BoardController();
        GUI gui = new GUI(boardController.getGui_fields());
    }
}

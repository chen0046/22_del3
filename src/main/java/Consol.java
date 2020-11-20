import gui_main.GUI;

public class Consol {
    BoardController boardController = new BoardController();
    GUI gui = new GUI(boardController.getGui_fields());
    Terning terning = new Terning();

    public void Startgame(){
        while(true) {
            gui.getUserButtonPressed("hej","Slå terningen");
            terning.roll();
            gui.setDie(terning.henttotal());
        }
    }



}

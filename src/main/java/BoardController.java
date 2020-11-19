import gui_fields.GUI_Field;
import gui_fields.GUI_Street;

public class BoardController {
    Board board;
    GUI_Field[] gui_fields;

    public BoardController(){
      board = new Board();
      gui_fields = new GUI_Field[23];

        for (int i = 0; i <23 ; i++) {
            gui_fields[i] = new GUI_Street();

            String title = board.getFields()[i].getTitle();
            gui_fields[i].setTitle(title);

        }

    }


    public void setGui_fields(GUI_Field[] gui_fields) {
        this.gui_fields = gui_fields;
    }

    public GUI_Field[] getGui_fields() {
        return gui_fields;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }



}

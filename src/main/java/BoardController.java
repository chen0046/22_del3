import gui_fields.*;

import java.awt.*;


public class BoardController {
    Board board;
    GUI_Field[] gui_fields;

    public BoardController() {
        board = new Board();
        gui_fields = new GUI_Field[24];
        board.setFields(board.fields);
        int i = 0;
        while (i < 24) {
            if (board.getFields()[i].isStart()) {
                gui_fields[i] = new GUI_Start("Start", "Modtag: 2", "Modtag kr. 200,-\nnår de passerer start", Color.RED, Color.BLACK);
            }
            else if (board.getFields()[i].isJail()) {
                gui_fields[i] = new GUI_Jail("default", "Fængsel", "Fængsel", "På besøg i fængslet", new Color(125, 125, 125), Color.BLACK);
        }
            else {
            gui_fields[i] = new GUI_Street();
            gui_fields[i].setTitle(board.getFields()[i].getTitle());
            gui_fields[i].setDescription(board.getFields()[i].getDescription());
            gui_fields[i].setSubText(board.getFields()[i].getSubText());
            gui_fields[i].setForeGroundColor(board.getFields()[i].getMain());
            gui_fields[i].setBackGroundColor(board.getFields()[i].getSecondary());
        }
        i++;
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

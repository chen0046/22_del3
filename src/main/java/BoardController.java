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
                gui_fields[i] = new GUI_Start("Start", "Modtag: M2", "Tillykke du har nu passeret,-\nog vil nu modtage M2", new Color(204, 204, 204), new Color(204, 0, 204));
            }
            else if (board.getFields()[i].isJail()) {
                gui_fields[i] = new GUI_Jail("default", "Fængsel", "Fængsel", "Du er nu på besøg i fængslet", new Color(125, 125, 125), Color.BLACK);
            }
            else if (board.getFields()[i].isChance()) {
                gui_fields[i] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
            }
            else if (board.getFields()[i].isParkering()){
                gui_fields[i] = new GUI_Refuge("default", "Gratis parkering", "Parkering", "Ta' en pause, du har helle", Color.WHITE, Color.BLACK);
            }
            else if (board.getFields()[i].isGoToJail()){
                gui_fields[i] =new GUI_Jail("default", "Gå i fængsel", "Gå i fængsel", "De fængsles\nSlå to ens for at komme ud", new Color(125, 125, 125), Color.BLACK);
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

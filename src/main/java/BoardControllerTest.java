import gui_fields.GUI_Field;
import gui_tests.PlayerTest;

import static org.junit.jupiter.api.Assertions.*;

class BoardControllerTest {

    @Test
    void isChanceFelt() {
        BoardController boardController = new BoardController();
        Spiller spiller = new Spiller();
        SpillerController spillerController = new SpillerController();
        Board board = new Board();
        GUI_Field[] testGuiFields = new GUI_Field[1];

        [0]= new Field();
        testGuiFields[0] = new GUI_Field();
        testGuiFields[14]=new Field();
        boardController.playerLandOnField(spiller, 1);
        assert true(spiller currentplayer, )




    }

    @Test
    void setChanceFelt() {
    }
}
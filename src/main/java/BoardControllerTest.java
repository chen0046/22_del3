import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class BoardControllerTest {

    @Test
    void getGui_fields() {
    }

    @Test
    void playerLandOnField() {
            BoardController boardController = new BoardController();
            SpillerController spillerController = new SpillerController();
            spillerController.makePlayers(1);
            SpillerController.spillere[0] = new Spiller();
            SpillerController.spillere[0].setNavn("testNavn");
            SpillerController.spillere[0].setPos(0);
            SpillerController.spillere[0].setSpillerID(0);
            SpillerController.spillere[0].spillerKonto.setBalance(20);
            OwnableField ownable = (OwnableField) boardController.board.getFields()[1];
            boardController.playerLandOnField(spillerController.getSpillere()[0], 1);
            assertEquals(spillerController.getSpillere()[0].getSpillerID(), ownable.getEjer());

        }

    @Test
    void playerLandOnFieldFree() {
    }

    @Test
    void isChanceFelt() {
    }

    @Test
    void setChanceFelt() {
    }
}
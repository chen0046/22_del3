import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;

public class Main {
    public static void main(String[] args) {
        GUI gui = new GUI();

        GUI_Player player = new GUI_Player("Stephen", 2000);
        gui.addPlayer(player);
        GUI_Field field = gui.getFields()[4];
        field.setCar(player, true);


    }
}
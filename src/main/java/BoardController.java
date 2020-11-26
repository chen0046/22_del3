import gui_fields.*;
import gui_main.GUI;
import java.awt.*;


public class BoardController {
    Board board;
    GUI_Field[] gui_fields;
    ChanceKortBunke bunke = new ChanceKortBunke();
    String flavorTekst;


    public BoardController() {
        board = new Board();
        gui_fields = new GUI_Field[24];
        board.setOwnableFields(board.fields);
        board.setFields(board.fields);
        bunke.bland();
        int i = 0;
        while (i < 24) {
            if (board.getFields()[i].isStart()) {
                gui_fields[i] = new GUI_Start("Start", "Modtag: M2", "Tillykke du har nu passeret,-\nog vil nu modtage M2", new Color(204, 204, 204), new Color(204, 0, 204));
            } else if (board.getFields()[i].isJail()) {
                gui_fields[i] = new GUI_Jail("default", "Fængsel", "Fængsel", "Du er nu på besøg i fængslet", new Color(125, 125, 125), Color.BLACK);
            } else if (board.getFields()[i].isChance()) {
                gui_fields[i] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
            } else if (board.getFields()[i].isParkering()) {
                gui_fields[i] = new GUI_Refuge("default", "Gratis parkering", "Parkering", "Ta' en pause, du har helle", Color.WHITE, Color.BLACK);
            } else if (board.getFields()[i].isGoToJail()) {
                gui_fields[i] = new GUI_Jail("default", "Gå i fængsel", "Gå i fængsel", "Du skal i fængsel!\nFor at komme ud af fængslet skal du, i din næste tur, enten betale M1 eller bruge et 'Du løslades unden omkostninger'- kort.", new Color(125, 125, 125), Color.BLACK);
            } else if (board.getFields()[i].isOwnable()) {
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

    public void playerLandOnField(Spiller currentSpiller, int fieldID) {
        if (board.getFields()[fieldID].isStart()) {

        } else if (board.getFields()[fieldID].isJail()) { this.flavorTekst = "Du er på besøg i fængslet. De har gratis parkering";

        } else if (board.getFields()[fieldID].isChance()) {this.flavorTekst = "Træk et kort";


        } else if (board.getFields()[fieldID].isParkering()) { this.flavorTekst = "Gratis parkering";

        } else if (board.getFields()[fieldID].isGoToJail()) {
            this.flavorTekst = "Du er desværre røget i fængsel";
            currentSpiller.setPos(6);
            currentSpiller.setInJail(true);
        } else {
            OwnableField ownable = (OwnableField) board.getFields()[fieldID];
            if (ownable.getEjer() == -1) {
                //TODO Hvad skal der ske hvis ingen ejer feltet
                ownable.setEjer(currentSpiller.getSpillerID());
                currentSpiller.spillerKonto.setBalance(-ownable.getPris());
                gui_fields[fieldID].setTitle(board.getFields()[fieldID].getTitle() + "\nEjes af: " + currentSpiller.getNavn());
                this.flavorTekst = board.getFields()[fieldID].getTitle() + "er blevet købt af: " + currentSpiller.getNavn();
                if (board.getFields()[fieldID - 1].isOwnable()) {
                    OwnableField ownableBefore = (OwnableField) board.getFields()[fieldID - 1];
                    if (ownable.getEjer() == ownableBefore.getEjer()) {
                        ownable.setHusleje(ownable.getHusleje() * 2);
                        ownableBefore.setHusleje(ownableBefore.getHusleje() * 2);
                        board.getFields()[fieldID].setSubText("Leje: M" + ownable.getHusleje());
                        board.getFields()[fieldID - 1].setSubText("Leje: M" + ownableBefore.getHusleje());
                        gui_fields[fieldID].setSubText(board.getFields()[fieldID].getSubText());
                        gui_fields[fieldID - 1].setSubText(board.getFields()[fieldID - 1].getSubText());
                        this.flavorTekst = board.getFields()[fieldID].getTitle() + "er blevet købt af: " + currentSpiller.getNavn() + " Du ejer nu begge felter af samme farve og lejen er nu fordoblet";
                    }
                } else if (fieldID != 23) {
                    if (board.getFields()[fieldID + 1].isOwnable()) {
                        OwnableField ownableAfter = (OwnableField) board.getFields()[fieldID + 1];
                        if (ownable.getEjer() == ownableAfter.getEjer()) {
                            ownable.setHusleje(ownable.getHusleje() * 2);
                            ownableAfter.setHusleje(ownableAfter.getHusleje() * 2);
                            board.getFields()[fieldID].setSubText("Leje: M" + ownable.getHusleje());
                            board.getFields()[fieldID + 1].setSubText("Leje: M" + ownableAfter.getHusleje());
                            gui_fields[fieldID].setSubText(board.getFields()[fieldID].getSubText());
                            gui_fields[fieldID + 1].setSubText(board.getFields()[fieldID + 1].getSubText());
                            this.flavorTekst = board.getFields()[fieldID].getTitle() + "er blevet købt af: " + currentSpiller.getNavn() + " Du ejer nu begge felter af samme farve og lejen er nu fordoblet";
                        }
                    }
                }
            }
            else if (currentSpiller.getSpillerID() == ownable.getEjer()) {
                        //TODO Hvad sker der hvis spilleren ejer feltet
                this.flavorTekst = "Du ejer allerede feltet";

                    }
            else if (currentSpiller.getSpillerID() != ownable.getEjer() && ownable.getEjer() != -1){
                        //TODO HVad sker der hvis spilleren ikke ejer feltet
                        currentSpiller.spillerKonto.setBalance(- ownable.getHusleje());
                        SpillerController.spillere[ownable.getEjer()].spillerKonto.setBalance(+ ownable.getHusleje());
                        this.flavorTekst = "Du er landet på en anden spillers felt.";
                    }


                }

            }
        }




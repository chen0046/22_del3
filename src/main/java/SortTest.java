
        SpillerController spillerController = new SpillerController();
        spillerController.makeTestPlayers(4);
        spillerController.getSpillere()[0] = new Spiller();
        spillerController.getSpillere()[1] = new Spiller();
        spillerController.getSpillere()[2] = new Spiller();
        spillerController.getSpillere()[3] = new Spiller();
        spillerController.getSpillere()[0].setNavn("A");
        spillerController.getSpillere()[1].setNavn("B");
        spillerController.getSpillere()[2].setNavn("C");
        spillerController.getSpillere()[3].setNavn("D");
        spillerController.getSpillere()[0].spillerKonto.setBalance(4);
        spillerController.getSpillere()[1].spillerKonto.setBalance(7);
        spillerController.getSpillere()[2].spillerKonto.setBalance(2);
        spillerController.getSpillere()[3].spillerKonto.setBalance(5);
        SpillerController.spillere[0].setPos(0);
        SpillerController.spillere[1].setPos(0);
        SpillerController.spillere[2].setPos(0);
        SpillerController.spillere[3].setPos(0);
        SpillerController.spillere[0].setSpillerID(0);
        SpillerController.spillere[1].setSpillerID(0);
        SpillerController.spillere[2].setSpillerID(0);
        SpillerController.spillere[3].setSpillerID(0);
        System.out.println("Først: ");

        int i = 0;
        while(i < spillerController.getSpillere().length) {
            System.out.println(spillerController.getSpillere()[i].spillerKonto.getBalance());
            i++;
        }
        int i2;
        int j;
        Spiller temp;
        for (i2 = 0; i2 < spillerController.getSpillere().length -1; i2++) {
            for (j = i2+1; j < spillerController.getSpillere().length; j++) {
                if (spillerController.getSpillere()[i2].spillerKonto.getBalance() > spillerController.getSpillere()[j].spillerKonto.getBalance()) {
                    temp = spillerController.getSpillere()[i2];
                    spillerController.getSpillere()[i2] = spillerController.getSpillere()[j];
                    spillerController.getSpillere()[j] = temp;

                }
            }
        }
        System.out.println("sorteret");
        int i3 = 0;
        while(i3 < spillerController.getSpillere().length) {
            System.out.println(spillerController.getSpillere()[i3].spillerKonto.getBalance());
            i3++;
        }
    }
}


 */
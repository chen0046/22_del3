public class SpillerController {

    public static void main(String[] args) {
        Spiller p1 = new Spiller("peter",new Konto(20));
p1.getKonto().setBalance(-2);
        System.out.println(p1.getKonto().getBalance());
    }

    }



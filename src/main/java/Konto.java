public class Konto {
    private int balance;

    public Konto(int balance) {
        this.balance = balance;
    }

    // laver en getter som gør så når vi kalder på den i andre klasser så viser den os
    //   hvor meget det ligger på kontoen
    public int getBalance() {
        return balance;
    }


    // Vi laver en setter som sørger for at kontoen aldrig kan komme under 0 og sørger for at vi kan
    //  sætte kontoens værdi til en ny værdi når vi bruger den i andre klasser
    public void setBalance(int balance) {
        this.balance += balance;
        if (this.balance < 0) {
            this.balance = 0;
        }
    }
}


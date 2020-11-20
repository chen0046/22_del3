public class Konto {
    int balance;
    int startBalance = 20;


    //public static void startBalance() {
    //  if (SpillerController.getSpillerAntal() = 2) {


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
        if (balance < 0) {
            setBalance(0);
        }
    }
}

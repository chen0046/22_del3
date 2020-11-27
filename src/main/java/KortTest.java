public class KortTest {
    public static void main(String[] args) {
        ChanceKortBunke testBunke = new ChanceKortBunke();
        testBunke.bland();
        int t = 0;
        while(t < 100) {
            testBunke.træk();
            testBunke.hentID();
            testBunke.hentT();
            System.out.println(testBunke.hentID());
            System.out.println(testBunke.hentT());
            t++;
        }

    }
}



public class KortTest {
    /*tester vores Chancekortdæk ved at trække 100 kort efter blanding og ser om vores blandingsmetode virker
 og om det giver os kortene i en bestemt rækkefølge*/
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



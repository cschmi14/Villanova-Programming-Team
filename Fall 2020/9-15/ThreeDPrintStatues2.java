import java.util.Scanner;
public class ThreeDPrintStatues2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n > 10000 || n < 1)
            return;
        int c, statE = 0, timeS, timeP, div, printers, pF;
        div = 2;
        double e = 1, timeSD, day = 1;
        double eO = n / 1;
        c = n;
        double x = n;
        while (c > 1) {
            e = (x / div);
            if ((((e) + (div / day)) > ((eO) + ((div - 1)) / day))) {
                c = 0;
                div = div - 2;
            }
            eO = e;
            div++;
            day++;
            c--;
        }
        if ((n) <= 3) {
            div--;
            }
        pF = div;
        timeP = 0;
        int pF2 = 1;
        while (pF > pF2) {
            pF2 = pF2 * 2;
            timeP++;
            } 
        statE = pF2 - pF;
        double divD = div;
        timeSD = ((n - statE) / (divD));
        timeSD = Math.ceil(timeSD);
        double time = timeSD + timeP;
        int timeI = (int)time;
        System.out.println(timeI);            
    }
}

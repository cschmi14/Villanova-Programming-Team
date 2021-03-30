import java.util.Scanner;
import java.util.*;
public class ThreeDPrintStatues3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n > 10000 || n < 1)
            return;
        int c, timeS, div, pF;
        div = 1;
        List<Double> good = new ArrayList<Double>();
        List<Integer> printers = new ArrayList<Integer>();
        double best = 0, timeP, statE = 0;
        double e = 1, timeSD, day = 1;
        double eO = n / 1;
        c = n;
        double x = n;
        while (c > 1) {
            e = (x / div);
            best = ((e + (div / (Math.log10(div)/Math.log10(2)))));
            good.add(best);
            printers.add(div);
            div++;
            c--;
        }
        Collections.sort(good);
        c = n - div;
        double i = good.get(0);
        best = printers.get((int)i);
        pF = (int)best;
        if ((n) <= 3) {
            div--;
            }
        System.out.println(pF);
        timeP = Math.log10(pF)/Math.log10(2);
        timeP = Math.floor(timeP);
        statE = pF - (pF - Math.pow(2, timeP));
        double divD = div;
        timeP++;
        timeSD = ((n - statE) / (pF));
        timeSD = Math.ceil(timeSD);
        double time = timeSD + timeP;
        int timeI = (int)time;
        System.out.println(timeI);            
    }
}
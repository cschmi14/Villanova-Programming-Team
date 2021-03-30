import java.util.Scanner;
import java.util.*;
public class TDPrintStatues {
    public static void main(String[] args) {
        double pF = 1, time = 0, n, statE = 0, c;
        Scanner scan = new Scanner(System.in);
        n = scan.nextDouble();
        c = n;
        List<Double> times = new ArrayList<Double>();
        while (c > 0) {
            statE = Math.pow(2, (Math.floor(Math.log10(pF)/Math.log10(2)))) - (pF - Math.pow(2, (Math.floor(Math.log10(pF)/Math.log10(2)))));
            time = Math.ceil((n - statE) / pF) + Math.ceil(Math.log10(pF)/Math.log10(2)) + 1;
            times.add(time);
            pF++;
            c--;
        }
        Collections.sort(times);
        double convertInt = times.get(0);
        int finalTime = (int)convertInt;
        System.out.println(finalTime);
    }
}
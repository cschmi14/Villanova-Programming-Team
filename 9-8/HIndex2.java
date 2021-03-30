import java.util.Scanner;
import java.util.*;
public class HIndex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> citations = new ArrayList<Integer>();
        int n = scan.nextInt();
        int sum = 0;
        int c;
        int i = 0;
        for (c = n; c > 0; c--) {
            int x = scan.nextInt();
            citations.add(x);
        }
        Collections.sort(citations);
        for (int s = 1, l = n; l > 0; l--, s++, i = s - 1) {
           for (c = (n); (c - s) >= 0; c--) {
               if (citations.get(c - s) >= citations.get(n - s))
                  i++;
               if (i >= citations.get(n - s)) {
                  System.out.println(citations.get(n - s));
                  return;
               }
           }
        }
     }   
}       
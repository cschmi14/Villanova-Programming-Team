import java.util.Scanner;
import java.util.*;
public class HIndex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> citations = new ArrayList<Integer>();
        int n = scan.nextInt();
        int sum = 0;
        int c;
        int g = 0;
        int i = 0;
        for (c = n; c > 0; c--) {
            int x = scan.nextInt();
            if (x < 0)
                return;
            citations.add(x);
        }
        Collections.sort(citations);
        for (int s = 1, l = n; l > 0; l--, s++, i = s - 1, g = s - 2) {
           for (c = (n); (c - s) >= 0; c--) {
               if (citations.get(c - s) >= citations.get(n - s))
                  i++;
               if (citations.get(c - s) < citations.get(n - 1))
                   g++;
               if (g > citations.get(n - s))
                   return;
               if (i >= citations.get(n - s)) {
                  System.out.println(citations.get(n - s));
                  return;
               }
           }
        }
     }   
}         
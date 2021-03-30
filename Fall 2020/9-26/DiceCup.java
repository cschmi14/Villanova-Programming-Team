import java.util.Scanner;
import java.util.*;
public class DiceCup {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int N = scan.nextInt();
       int M = scan.nextInt();
       List<Integer> totals = new ArrayList<Integer>();
       int c1 = 1, c2 = 1;
       while (c1 <= N) {
           while (c2 <= M) {
               totals.add(c1 + c2);
               c2++;
           }
       c1++;
       c2 = 1;
       }
       int occ = 0; 
       int n = totals.size();
       int x = 2;
       int occPrev;
       List<Integer> occs = new ArrayList<Integer>();
       while (x <= M + N) {
          for (int i=0; i<n; i++) {
              if (x == totals.get(i)) {
                 occ++; 
              }
          }
       occs.add(occ);
       occ = 0;
       x++;  
       }
       x = 0; 
       List<Integer> finalNums = new ArrayList<Integer>();
       while (x < occs.size() - 1) {
           if (occs.get(x) >= occs.get(x + 1)) {
               if (occs.get(x) >= occs.get(x - 1))
                   finalNums.add(x + 2);
           }
       x++;
       }
       System.out.println(occs);
       finalNums.forEach(num ->{
           System.out.println(num);
       });
    }
}
import java.util.*;
public class EasiestProblem {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        
        int n;
        String s = "";
        String s2 = "";
        int sum2 = 0;
        int sum1 = 0;
        int x;
        boolean t = false;
        do {
            n = scan.nextInt();
            if (n == 0)
                return;
            s = Integer.toString(n);
            for (int i = 0; i < s.length(); i++) {
                sum1 += Character.getNumericValue(s.charAt(i));
            }
            for (int p = 11; t != true; p++) {
                x = p * n;
                s2 = Integer.toString(x);
                for (int i = 0; i < s2.length(); i++) {
                    sum2 += Character.getNumericValue(s2.charAt(i));
                }
                if (sum2 == sum1) {
                    t = true;
                    System.out.println(p);
                }
                else 
                    sum2 = 0;
            }
            t = false;
            sum1 = 0;
            sum2 = 0;
        } while(n != 0);
    
    }

}
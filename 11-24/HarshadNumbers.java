import java.util.Scanner;
public class HarshadNumbers {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        boolean t = false;
        String s = scan.next();
        int sum = 0;
        for (int n = Integer.parseInt(s); t != true; sum = 0, n++, s = Integer.toString(n)) {
            for (int i = 0; i < s.length(); i++) {
                sum += Character.getNumericValue(s.charAt(i));
            }
            if (n % sum == 0) {
                t = true;
                System.out.println(n);
            }
        }
        
    
    }

}
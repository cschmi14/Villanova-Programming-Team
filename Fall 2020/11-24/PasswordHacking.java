import java.util.Scanner;
public class PasswordHacking {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        int n, c;
        for (n = scan.nextInt(), c = 1; c <= n; c++) {
            
            scan.next();
            sum = sum + (c * scan.nextDouble());
        
        }
        
        System.out.println(sum);
    
    }

}
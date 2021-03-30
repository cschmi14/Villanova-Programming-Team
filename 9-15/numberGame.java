import java.util.Scanner;
public class numberGame {
    public static void main(String[] args) {
        double a, b, c, n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        while (n > 0) {
            a = scan.nextDouble();
            b = scan.nextDouble();
            c = scan.nextDouble();
            n--;
            if (a + b == c)
                System.out.println("Possible");
            else if ((a - b == c) || (b - a == c))
                System.out.println("Possible");
            else if (a * b == c)
                System.out.println("Possible");
            else if ((a / b == c) || (b / a == c))
                System.out.println("Possible");
            else
                System.out.println("Impossible");
        }
        
    }
}
import java.util.Scanner;
public class Pot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), num = 0, num1 = 0, pow = 0;
        double sum = 0;
        while (n > 0) {
            num = scan.nextInt();
            num1 = num / 10;
            pow = num % 10;
            sum = sum + Math.pow(num1, pow);
            n--;
        }
        System.out.println((int)sum);
    }
}
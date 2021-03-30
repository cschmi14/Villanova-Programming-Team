import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    int n;
    int x;
    int y;
    int v = 1;
    x = scan.nextInt();
    y = scan.nextInt();
    n = scan.nextInt();
    while (!(v > n)) {
        if ((v % x == 0) && (v % y == 0)) {
            System.out.println("FizzBuzz");
            v++;
            }
        else if (v % x == 0) {
            System.out.println("Fizz");
            v++;
            }
        else if (v % y == 0) {
            System.out.println("Buzz");
            v++;
            }
        else {
            System.out.println(v);
            v++;
            }
        }
    }
}
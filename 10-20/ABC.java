import java.util.Scanner;
public class ABC {

    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    int a, b, c;
    int num1 = scan.nextInt(), num2 = scan.nextInt(), num3 = scan.nextInt();
    String order = scan.next();
    
    if (num1 > num2) {
        if (num1 > num3) {
            a = num1;
            if (num2 > num3) {
                b = num2;
                c = num3;
            }
            else {
                b = num3;
                c = num2;
            }
        }
        else {
            b = num1;
            c = num2;
            a = num3;
        }
    }
    else {
        if (num1 > num3) {
            a = num2;
            b = num1;
            c = num3;
        }
        else {
            if (num2 > num3) {
                a = num2;
                b = num3;
                c = num1;
            }
            else {
                a = num3;
                b = num2;
                c = num1;
            }
        }
    }
    if (order.charAt(0) == 'C') {
        System.out.print(a + " ");
    }
    else if (order.charAt(0) == 'B') {
        System.out.print(b + " ");
    }
    else if (order.charAt(0) == 'A') {
        System.out.print(c + " ");
    }
    if (order.charAt(1) == 'C') {
        System.out.print(a + " ");
    }
    else if (order.charAt(1) == 'B') {
        System.out.print(b + " ");
    }
    else if (order.charAt(1) == 'A') {
        System.out.print(c + " ");
    }
    if (order.charAt(2) == 'C') {
        System.out.print(a + " ");
    }
    else if (order.charAt(2) == 'B') {
        System.out.print(b + " ");
    }
    else if (order.charAt(2) == 'A') {
        System.out.print(c + " ");
    }
            
            
    }
    

}
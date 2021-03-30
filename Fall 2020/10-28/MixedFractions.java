import java.util.Scanner;
public class MixedFractions {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int n1 = 1, n2 = 1;
        while (!(n1 == 0 && n2 == 0)) {
           n1 = scan.nextInt();
           n2 = scan.nextInt();
           if (!(n1 == 0 && n2 == 0)) {
           System.out.print(n1 / n2);
           System.out.print(" " + (n1 % n2) + " / " + n2);
           System.out.println();
           }
        } 
    }

}
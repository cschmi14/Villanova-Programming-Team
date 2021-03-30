import java.util.Scanner;
public class ColdputerScience {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 0;
        do {
            int t = scan.nextInt();
            if (t < 0)
                i++;
            n--;
        } while (n > 0);
        System.out.println(i);
    }
}
import java.util.Scanner;
public class AnotherBrickinTheWall {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt(), w = scan.nextInt(), n = scan.nextInt();
        int[] bricks = new int[n];
        for (int i = 0; i < n; i++) {
            bricks[i] = scan.nextInt();
        }
        int x = w;
        int f = 0;
        for (int i = 0; i < h; i++) {
            x = w;
            while (x != 0) {
                x -= bricks[f];
                f++;
                if (x < 0) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    
    }

}
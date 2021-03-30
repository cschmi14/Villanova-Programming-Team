import java.util.Scanner;
public class PieceofCake {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt(), h = scan.nextInt(), v = scan.nextInt(), area;
        if (s - h > s / 2) {
            if (s - v > s / 2)
                area = (s - v) * (s - h);
            else
                area = (s - h) * v;
        }
        else {
            if (s - v > s / 2)
                area = (s - v) * h;
            else
                area = h * v;
        }
    
        System.out.println(area * 4);
    }
}
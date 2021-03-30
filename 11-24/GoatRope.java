import java.util.Scanner;
public class GoatRope {

    public static double Square(double x) {
        x = x * x;
        return x;
    }

    public static void main(String[] args) {
    
        double x, y, x1, x2, y1, y2, length = 0;
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        y = scan.nextInt();
        x1 = scan.nextInt();
        y1 = scan.nextInt();
        x2 = scan.nextInt();
        y2 = scan.nextInt();
        
        if (x <= x2 && x >= x1) {
            if (y > y2)
                length = (y - y2);
            else 
                length = (y1 - y);
        }
        
        if (y <= y2 && y >= y1) {
            if (x > x2)
                length = x - x2;
            else
                length = x1 - x;
        }
        
        if (y > y2) {
            if (x > x2)
                length = Math.sqrt(Square(x - x2) + Square(y - y2));
            else if (x < x1)
                length = Math.sqrt(Square(x1 - x) + Square(y - y2));
        }
        
        else if (y < y1) {
            if (x > x2)
                length = Math.sqrt(Square(x - x2) + Square(y1 - y));
            else if (x < x1)
                length = Math.sqrt(Square(x1 - x) + Square(y1 - y));
        }
        
        System.out.println(length);
        
    }

}
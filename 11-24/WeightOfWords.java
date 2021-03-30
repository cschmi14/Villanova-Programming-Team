import java.util.*;
public class WeightOfWords {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        double l = scan.nextInt();
        double w = scan.nextInt();
        
        if (w > (l * 26)) {
            System.out.println("impossible");
            return;
        }
        
        if (l > w) {
            System.out.println("impossible");
            return;
        }
        
        double rem = (w % l);
        int let = (int)(w / l);
        
        char c = (char)(let + 97);
        while (rem > 0) {
            System.out.print(c);
            w -= let + 1;
            rem--;
            l--;
        }
        let = (int)(w / l);
        while (l > 0) {
            System.out.print((char)(let + 96));
            l--;
        }
    
    }

}
import java.util.Scanner;
public class PokerHand {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String[] cards = new String[5];
        for (int i = 4; i >= 0; i--) {
            cards[i] = scan.next();
        }
        char d;
        int count;
        int max = 1;
        for (int i = 0; i < 5; i++) {
            d = cards[i].charAt(0);
            count = 0;
            for (int c = 0; c < 5; c++) {
                if (cards[c].charAt(0) == d)
                    count++;
            }
            if (count > max)
                max = count;
        }
        System.out.println(max);
    }

}
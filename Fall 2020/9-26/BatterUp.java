import java.util.Scanner;
public class BatterUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        double total = 0, count = 0;
        for (total = scan.nextInt(), count = total; count > 0; count--) {
            num = scan.nextInt();
            if (num == -1) {
                total--;
            }
            else {
                sum = sum + num;
            }
        }
        double avg = sum / total;
        System.out.println(avg);
    }
}
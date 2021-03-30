import java.util.Scanner;
public class Pet {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int max = 0;
        int index = 0;
        int count = 0;
        for (int i = 0; i < 5; i++) {
            sum += scan.nextInt();
            sum += scan.nextInt();
            sum += scan.nextInt();
            sum += scan.nextInt();
            count++;
            if (sum > max) {
                max = sum;
                index = count;
            }
            sum = 0;
        }
        System.out.print(index + " " + max);
        
    }
    
}
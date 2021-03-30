import java.util.Scanner;
public class Backspace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        str1 = str1.replaceAll("<", "\\\b");
        System.out.println(str1);
    }
}
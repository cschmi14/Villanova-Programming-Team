import java.util.Scanner;
public class Backspace2 {
    public static String backspace(String str, int p) {  
        return str.substring(0, p - 1) + str.substring(p + 1);  
        }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        int x = str1.indexOf('<'), i = x;
        while (i != -1) {
            str1 = backspace(str1, i);
            x = i - 1;
            i = str1.indexOf('<', x);
        }
        System.out.println(str1);
    }
}
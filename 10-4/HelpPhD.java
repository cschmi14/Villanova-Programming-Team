import java.util.Scanner;
public class HelpPhD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0, res = 0, i = 0, c = 1, num1 = 0, n = scan.nextInt();
        char mid = ' ';
        String strc = "";
        do {
            strc = scan.next();
            if (strc.equals("P=NP")) {
                System.out.println("skipped");
            }
            else {
                while (c != 0) {
                    if (strc.charAt(i) == '+')
                        c = 0;
                    else
                        i++;
                }
                num = Integer.parseInt(strc.substring(0, i));
                num1 = Integer.parseInt(strc.substring(i + 1));
                res = num + num1;
                System.out.println(res);
            }
            n--;
            i = 0;
            c = 1;
        } while (n > 0);
        
    }
}
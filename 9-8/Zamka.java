import java.util.Scanner;
import java.util.*;
import java.util.List;
public class Zamka {
    public static void main(String[] args) {
    int l, d, x, n, m, sum, g, size;
    Scanner scan = new Scanner(System.in);
    l = scan.nextInt();
    d = scan.nextInt();
    x = scan.nextInt();
    n = l;
    List<Integer> digits = new ArrayList<Integer>();
    sum = 0;
    
    for (int c = l; c <= d; c++) {
        n = c;
        digits.clear();
        g = 0;
        sum = 0;
        while (n > 0) {
            digits.add(n % 10);
            n /= 10;
            }
        size = digits.size();
        while (size > 0) {
            sum = digits.get(g) + sum;
            g++;
            size--;
            }
        if (sum == x) {
            System.out.println(c);
            c = 20000;
            }
    }
    for (int c = d; c >= l; c--) {
        n = c;
        digits.clear();
        g = 0;
        sum = 0;
        while (n > 0) {
            digits.add(n % 10);
            n /= 10;
            }
        size = digits.size();
        while (size > 0) {
            sum = digits.get(g) + sum;
            g++;
            size--;
            }
        if (sum == x) {
            System.out.println(c);
            c = -10;
            }
    }    
    }
}
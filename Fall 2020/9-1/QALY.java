import java.util.Scanner;
public class QALY {
    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    int n;
    double q;
    double y;
    double qaly = 0;
    double qaly2 = 0;
    double p;
    double fq = 0;
    n = scan.nextInt();
    int oN = n;
    if (n >= 1) {
        q = scan.nextDouble();
        y = scan.nextDouble();
        qaly = q * y;
        while (n > 1) {
            n--;
            q = scan.nextDouble();
            y = scan.nextDouble();
            qaly2 = q * y;
            fq = fq + qaly2;
            }
        }  
    fq = fq + qaly;
    if (oN == 1)
        System.out.println(qaly);
    else
        System.out.println(fq);  
    }
}
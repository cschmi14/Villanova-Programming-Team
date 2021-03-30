import java.util.Scanner;
public class Matrix1 {

        
    
    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    int m;
    int n;
    int r, c;
    char [][] data;
    char [][] data2;
    String line = "";

        m = scan.nextInt();
        n = scan.nextInt();
        r = scan.nextInt();
        c = scan.nextInt();
        data = new char [m][n];
        for (int i = 0; i < m; i++) {
            line = scan.next();
            for (int j = 0; j < n; j++) {
                data[i][j] = line.charAt(j);
            }
        }     
        
        
        
    
    
    
    
        data2 = new char[r * m][c * n];
        int f = c;   
        int g = r;
        int x = 0;
            for (int i = 0; i < m; i++, f = c, g += r) {
                for (x = x; x < g; x++, f = c) {
                   for (int j = 0, l = 0; j < n; j++, f += c) {
                       for (l = l; l < f; l++) {
                           data2[x][l] = data[i][j];
                       }
                   }
                }
            }
        
        
        for (int i = 0; i < m * r; i++) {
            for (int j = 0; j < c * n; j++) 
                System.out.print(data2[i][j]);
            System.out.println();
        }
        
        
    
    }
}

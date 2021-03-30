import java.util.Scanner;
public class QBoard1 {

    
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        int m, n, x;
        boolean t = true;
        
        x = scan.nextInt();
        int[][] board;
        board = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                board[i][j] = 0;
            }
        }
        
        for (int c = x; c > 0; c--) {
            
            m = scan.nextInt();
            n = scan.nextInt();
            board[m][n] = 1;
        
            for (int i = 0; i < x; i++) {
                if (i == m)
                    i = i;
                else if (board[i][n] != 0)
                    t = false;
            }
            for (int j = 0; j < x; j++) {
                if (j == n)
                    j = j;
                else if (board[m][j] != 0)
                    t = false;
            }
            for (int i = m + 1, j = n + 1; i < x && j < x; i++, j++) {
                if (board[i][j] != 0)
                    t = false;
            }
            for (int i = m - 1, j = n - 1; i >= 0 && j >= 0; i--, j--) {
                if (board[i][j] != 0)
                    t = false;
            }
            for (int i = m + 1, j = n - 1; i < x && j >= 0; i++, j--) {
                if (board[i][j] != 0)
                    t = false;
            }
            for (int i = m - 1, j = n + 1; i >= 0 && j < x; i--, j++) {
                if (board[i][j] != 0)
                    t = false;
            }
        
        }
        
        
        if (t == true)
            System.out.println("CORRECT");
        else
            System.out.println("INCORRECT");

        

  
    }



}
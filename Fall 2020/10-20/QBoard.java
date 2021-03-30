import java.util.Scanner;
public class QBoard {

    int x, n, m;
    int[][] board;
    Scanner scan = new Scanner(System.in);

    public QBoard(int x) {
        this.x = x;
        board = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                board[i][j] = 0;
            }
        }
    }
    
    public boolean checkBoard() {
        
        for (int c = x; c > 0; c--) {
            
            m = scan.nextInt();
            n = scan.nextInt();
            board[m][n] = 1;
        
            for (int i = 0; i < x; i++) {
                if (i == m)
                    i = i;
                else if (board[i][n] != 0)
                    return false;
            }
            for (int j = 0; j < x; j++) {
                if (j == n)
                    j = j;
                else if (board[m][j] != 0)
                    return false;
            }
            for (int i = m + 1, j = n + 1; i < x && j < x; i++, j++) {
                if (board[i][j] != 0)
                    return false;
            }
            for (int i = m - 1, j = n - 1; i >= 0 && j >= 0; i--, j--) {
                if (board[i][j] != 0)
                    return false;
            }
            for (int i = m + 1, j = n - 1; i < x && j >= 0; i++, j--) {
                if (board[i][j] != 0)
                    return false;
            }
            for (int i = m - 1, j = n + 1; i >= 0 && j < x; i--, j++) {
                if (board[i][j] != 0)
                    return false;
            }
        
        }
        return true;
    }
    
    public void showBoard() {
    
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) 
                System.out.print(board[i][j]);
            System.out.println();
        }
    
    }
    
    
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        QBoard aboard = new QBoard(x);
        boolean t = aboard.checkBoard();
        
        if (t == true)
            System.out.println("CORRECT");
        else
            System.out.println("INCORRECT");
        
        aboard.showBoard();
        
    }

}
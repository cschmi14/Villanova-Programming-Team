import java.util.*;
public class ImageProcessing {

    public static int[][] SwitchRowColumn(int[][] x) {
        int[][] copyX = new int[x.length][x[0].length];
        int rows = x.length - 1;
        int columns = x[0].length - 1;
        int temp = 0;
        for (int i = 0; i < x.length; i++, rows--) {
            copyX[rows] = x[i];
        }
        for (int i = 0; i < x[0].length; i++) {
            for (int j = 0, k = columns; j < Math.ceil((double)columns / 2); j++, k--) {
                temp = copyX[i][k];
                copyX[i][k] = copyX[i][j];
                copyX[i][j] = temp;
            }
        }
        return copyX;
    }
    
    public int MultiplySection(int[][] x, int r, int c) {
        
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt(), w = scan.nextInt(), n = scan.nextInt(), m = scan.nextInt();
        int[][] image = new int[h][w];
        int[][] kernel = new int[n][m];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                image[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                kernel[i][j] = scan.nextInt();
            }
        }
        kernel = SwitchRowColumn(kernel);
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                image[i][j] = 
            }
        }
    
    }

}
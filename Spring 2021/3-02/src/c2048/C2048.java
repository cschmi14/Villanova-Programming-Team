
package c2048;
import java.util.Scanner;
public class C2048 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] board = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				board[i][j] = scan.nextInt();
			}
		}
		int move = scan.nextInt();
		if (move == 0) {
			board = moveLeft(board);
		}
		if (move == 2) {
			board = moveRight(board);
		}
		if (move == 3) {
			board = moveDown(board);
		}
		if (move == 1) {
			board = moveUp(board);
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static int[][] moveLeft(int[][] b) {
		
		for (int i = 0; i < 4; i++) {
			
			if (b[i][1] == 0 && b[i][0] == 0 && b[i][2] == 0) {
				b[i][0] = b[i][3];
				b[i][3] = 0;
			}
			else if (b[i][0] == 0 && b[i][1] == 0) {
				b[i][0] = b[i][2];
				b[i][2] = 0;
			}
			else if (b[i][0] == 0) {
				b[i][0] = b[i][1];
				b[i][1] = 0;
			}
			if (b[i][0] == b[i][1]) {
				b[i][0] *= 2;
				b[i][1] = 0;
			}
			else if (b[i][0] == b[i][3] && b[i][2] == 0 && b[i][1] == 0) {
				b[i][0] *= 2;
				b[i][3] = 0;
			}
			else if (b[i][0] == b[i][2] && b[i][1] == 0) {
				b[i][0] *= 2;
				b[i][2] = 0;
			}
			if (b[i][1] == 0 && b[i][2] == 0) {
				b[i][1] = b[i][3];
				b[i][3] = 0;
			}
			else if (b[i][1] == 0) {
				b[i][1] = b[i][2];
				b[i][2] = 0;
			}	
			if (b[i][1] == b[i][2] && b[i][1] != 0) {
				b[i][1] *= 2;
				b[i][2] = 0;
			}
			else if (b[i][1] == b[i][3] && b[i][2] == 0) {
				b[i][1] *= 2;
				b[i][3] = 0;
			}
			if (b[i][2] == b[i][3]) {
				b[i][2] *= 2;
				b[i][3] = 0;
			}		
			else if (b[i][2] == 0) {
				b[i][2] = b[i][3];
				b[i][3] = 0;
			}
			
		}
		return b;
		
	}
	
	public static int[][] moveRight(int[][] b) {
		
		for (int i = 0; i < 4; i++) {
			
			if (b[i][2] == 0 && b[i][3] == 0 && b[i][1] == 0) {
				b[i][3] = b[i][0];
				b[i][0] = 0;
			}
			else if (b[i][3] == 0 && b[i][2] == 0) {
				b[i][3] = b[i][1];
				b[i][1] = 0;
			}
			else if (b[i][3] == 0) {
				b[i][3] = b[i][2];
				b[i][2] = 0;
			}
			if (b[i][3] == b[i][2]) {
				b[i][3] *= 2;
				b[i][2] = 0;
			}
			else if (b[i][3] == b[i][1] && b[i][2] == 0) {
				b[i][3] *= 2;
				b[i][1] = 0;
			}
			else if (b[i][3] == b[i][0] && b[i][1] == 0 && b[i][2] == 0) {
				b[i][3] *= 2;
				b[i][0] = 0;
			}
			if (b[i][2] == 0 && b[i][1] == 0) {
				b[i][2] = b[i][0];
				b[i][0] = 0;
			}
			else if (b[i][2] == 0) {
				b[i][2] = b[i][1];
				b[i][1] = 0;
			}		
			if (b[i][1] == b[i][2]) {
				b[i][2] *= 2;
				b[i][1] = 0;
			}
			else if (b[i][2] == b[i][0] && b[i][1] == 0) {
				b[i][2] *= 2;
				b[i][0] = 0;
			}
			if (b[i][1] == b[i][0]) {
				b[i][1] *= 2;
				b[i][0] = 0;
			}
			else if (b[i][1] == 0) {
				b[i][1] = b[i][0];
				b[i][0] = 0;
			}
			
		}
		return b;
		
	}
	
public static int[][] moveDown(int[][] b) {
		
		for (int i = 0; i < 4; i++) {
			
			if (b[1][i] == 0 && b[2][i] == 0 && b[3][i] == 0) {
				b[3][i] = b[0][i];
				b[0][i] = 0;
			}
			else if (b[3][i] == 0 && b[2][i] == 0) {
				b[3][i] = b[1][i];
				b[1][i] = 0;
			}
			else if (b[3][i] == 0) {
				b[3][i] = b[2][i];
				b[2][i] = 0;
			}	
			if (b[3][i] == b[2][i]) {
				b[3][i] *= 2;
				b[2][i] = 0;
			}
			else if (b[1][i] == b[3][i] && b[2][i] == 0) {
				b[3][i] *= 2;
				b[1][i] = 0;
			}
			else if (b[0][i] == b[3][i] && b[1][i] == 0 && b[2][i] == 0) {
				b[3][i] *= 2;
				b[0][i] = 0;
			}
			if (b[1][i] == 0 && b[2][i] == 0) {
				b[2][i] = b[0][i];
				b[0][i] = 0;
			}
			else if (b[2][i] == 0) {
				b[2][i] = b[1][i];
				b[1][i] = 0;
			}	
			if (b[1][i] == b[2][i]) {
				b[2][i] *= 2;
				b[1][i] = 0;
			}
			else if (b[0][i] == b[2][i] && b[1][i] == 0) {
				b[2][i] *= 2;
				b[0][i] = 0;
			}
			if (b[0][i] == b[1][i]) {
				b[1][i] *= 2;
				b[0][i] = 0;
			}	
			else if (b[1][i] == 0) {
				b[1][i] = b[0][i];
				b[0][i] = 0;
			}
			
		}
		return b;
		
	}

public static int[][] moveUp(int[][] b) {
	
	for (int i = 0; i < 4; i++) {
		
		if (b[2][i] == 0 && b[1][i] == 0 && b[0][i] == 0) {
			b[0][i] = b[3][i];
			b[3][i] = 0;
		}
		else if (b[0][i] == 0 && b[1][i] == 0) {
			b[0][i] = b[2][i];
			b[2][i] = 0;
		}
		else if (b[0][i] == 0) {
			b[0][i] = b[1][i];
			b[1][i] = 0;
		}	
		if (b[0][i] == b[1][i]) {
			b[0][i] *= 2;
			b[1][i] = 0;
		}
		else if (b[2][i] == b[0][i] && b[1][i] == 0) {
			b[0][i] *= 2;
			b[2][i] = 0;
		}
		else if (b[3][i] == b[0][i] && b[2][i] == 0 && b[1][i] == 0) {
			b[0][i] *= 2;
			b[3][i] = 0;
		}	
		if (b[2][i] == 0 && b[1][i] == 0) {
			b[1][i] = b[3][i];
			b[3][i] = 0;
		}
		else if (b[1][i] == 0) {
			b[1][i] = b[2][i];
			b[2][i] = 0;
		}
		if (b[2][i] == b[1][i]) {
			b[1][i] *= 2;
			b[2][i] = 0;
		}
		else if (b[3][i] == b[1][i] && b[2][i] == 0) {
			b[1][i] *= 2;
			b[3][i] = 0;
		}		
		if (b[3][i] == b[2][i]) {
			b[2][i] *= 2;
			b[3][i] = 0;
		}	
		else if (b[2][i] == 0) {
			b[2][i] = b[3][i];
			b[3][i] = 0;
		}
		
	}
	return b;
	
}

	
	
}
	

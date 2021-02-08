package aDifferentProblem;
import java.util.Scanner;
public class ADifferentProblemMain {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		long a, c, b;
		while (true) {
			if (scan.hasNextLong() == false) {
				break;
			}
			a = scan.nextLong();
			b = scan.nextLong();
			c = a - b;
			c = Math.abs(c);
			System.out.println(c);
		}
		
	}
	
}

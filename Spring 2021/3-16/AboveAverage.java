import java.util.Scanner;
public class AboveAverage {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		for (int i = 0; i < c; i++) {
			
			int n = scan.nextInt();
			int[]x = new int[n];
			for (int j = 0; j < n; j++) {
				x[j] = scan.nextInt();
			}
			System.out.printf("%.3f", findPercentage(x));
			System.out.print("%");
			System.out.println();
			
		}
	}
	public static double findAverage(int[] x) {
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		return ((double)sum / x.length);
	}
	public static double findPercentage(int[] x) {
		double avg = findAverage(x);
		int count = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] > avg) {
				count++;
			}
		}
		return (100 * (double)count / x.length);
	}
}

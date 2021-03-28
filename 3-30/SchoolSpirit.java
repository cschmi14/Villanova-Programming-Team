import java.util.Scanner;
import java.util.Stack;
public class SchoolSpirit {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] scores = new int[n];
		double[] gscores = new double[n];
		Stack<Double> tempScores = new Stack<Double>();
		for (int i = 0; i < n; i++) {
			
			scores[i] = scan.nextInt();
			
		}
		System.out.println(findAverage(scores));
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j != i) {
					tempScores.push((double)scores[j]);
				}
			}
			gscores[i] = findAverage(tempScores);
		}
		double sum = 0;
		for (int i = 0; i < gscores.length; i++) {
			sum += gscores[i];
		}
		System.out.println(sum / n);
	}
	public static double findAverage(int[] x) {
		double multiply = 0.8;
		double sum = 0;
		for (int i = 0; i < x.length; i++) {
			
			sum += (double)x[i] * (Math.pow(multiply, i));
			
		}
		return (sum * 1/5);
	}
	public static double findAverage(Stack x) {
		double multiply = 0.8;
		double sum = 0;
		for (int i = x.size() - 1; i >= 0; i--) {
			
			sum += (double)x.pop() * (Math.pow(multiply, i));
			
		}
		return (sum * 1/5);
	}
}

import java.util.Scanner;
public class FinalExam {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] hanh = new String[n];
		String[] correct = new String[n];
		for (int i = 0; i < n; i++) {
			correct[i] = scan.next();
		}
		for (int i = 0, j = 1; j < n; i++, j++) {
			hanh[i] = correct[j];
		}
		hanh[n - 1] = "f";
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (hanh[i].equals(correct[i])) {
				count++;
			}
		}
		System.out.println(count);
		
	}
}

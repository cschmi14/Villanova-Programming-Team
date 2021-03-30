import java.util.Scanner;
public class EncodedMessage {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		for (int i = 0; i < c; i++) {
			String str = scan.next();
			System.out.println(decipher(createArr(str)));
		}
	}
	public static String[][] createArr(String x) {
		int s = (int)Math.sqrt(x.length());
		String[][] arr = new String[s][s];
		int index = 0;
		for (int i = 0; i < s; i++) {
			for (int j = 0; j < s; j++) {
				arr[i][j] = Character.toString(x.charAt(index++));
			}
		}
		return arr;
	}
	public static String decipher(String[][] arr) {
		String str = "";
		int s = arr.length;
		for (int i = s - 1; i >= 0; i--) {
			for (int j = 0; j < s; j++) {
				str += arr[j][i];
			}
		}
		return str;
	}
}

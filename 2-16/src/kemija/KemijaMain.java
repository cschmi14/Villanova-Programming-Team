package kemija;
import java.util.Scanner;
public class KemijaMain {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		for (int i = 0; i < str.length(); i++) {
			
			switch (str.charAt(i)) {
				case 'a' :
					str = str.substring(0, i) + str.substring(i + 2, str.length());	
					break;
				case 'e' :
					str = str.substring(0, i) + str.substring(i + 2, str.length());
					break;
				case 'i' :
					str = str.substring(0, i) + str.substring(i + 2, str.length());	
					break;
				case 'o' :
					str = str.substring(0, i) + str.substring(i + 2, str.length());
					break;
				case 'u' :
					str = str.substring(0, i) + str.substring(i + 2, str.length());	
					break;
			}
			
		}
		
		System.out.println(str);
		
		
	}
}

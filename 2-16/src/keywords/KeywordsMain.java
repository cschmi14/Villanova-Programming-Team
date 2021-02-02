package keywords;
import java.util.*;
public class KeywordsMain {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		List<String> words = new ArrayList<String>();
		Set<String> unique = new HashSet<String>();
		
		String word = "";
		
		for (int i = 0; i < n; i++) {
			word = scan.next();
			word = word.toLowerCase();
			word = word.replace('-', ' ');
			words.add(word);
		}
		
		scan.close();
		
		unique.addAll(words);
		
		System.out.println(unique.size());
		
	}
}

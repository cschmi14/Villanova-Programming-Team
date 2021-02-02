package keywords;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicates {

public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		Set<String> words = new HashSet<String>();
		Set<String> duplicates = new HashSet<String>();
		
		String word = "";
		
		for (int i = 0; i < n; i++) {
			word = scan.next();
			word = word.toLowerCase();
			word = word.replace('-', ' ');
			words.add(word);
		}
		
		
		scan.close();
		
		for (String str : words) {
			
			if (!words.add(str)) {
				
				duplicates.add(str);
				
			}
			
		}
		
		System.out.println(duplicates.size());
		
	}
	
}

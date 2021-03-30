package homework;
import java.util.Scanner;
public class Homework {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		String input = scan.nextLine();
		scan.close();
		
		input = input.replace(';', ' ');
		Scanner numberScan = new Scanner(input);
		int sum = 0;
		String temp = "";
		while (numberScan.hasNext()) {
			temp = numberScan.next();
			if (temp.contains("-")) {
				sum += problemsInRange(temp);
			}
			else {
				sum ++;
			}
		}
		System.out.println(sum);
		
		
	}
	
    public static int problemsInRange(String a) {
    	int index = 0;;
    	for (int i = 0; i < a.length(); i++) {
    		if (a.charAt(i) == '-') {
    			i = a.length();
    		}
    		else {
    			index++;
    		}
    			
    	}
    	int b = Integer.parseInt(a.substring(0, index));
    	int c = Integer.parseInt(a.substring(index + 1));
    	
    	int numProblems = c - b + 1;
    	
    	return numProblems;
    }
}

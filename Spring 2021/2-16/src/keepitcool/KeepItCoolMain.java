package keepitcool;

import java.util.Scanner;

public class KeepItCoolMain {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int s = scan.nextInt();
		int d = scan.nextInt();
		
		int[] bottles = new int[s];
		int[] newBottles = new int[s];
		
		for (int i = 0; i < s; i++) {
			bottles[i] = scan.nextInt();
		}
		
		int sum = 0;
		
		for (int i = 0; i < s; i++) {
			sum += bottles[i];
		}
		
		if (sum < m) {
			System.out.println("impossible");
			return;
		}
		
		int bottlesLeft = n;
		
		for (int i = 0; bottlesLeft > 0; i++) {
			for (int j = 0; j < s; j++) {
				if (bottles[j] == i) {
					if (bottlesLeft >= d - bottles[j]) {
					    newBottles[j] =  d - bottles[j];
					}
					else {
						newBottles[j] = bottlesLeft;
					}
					bottlesLeft -= newBottles[j];
				}
			}
		}
		
		for (int i = 0; i < s; i++) {
			System.out.print(newBottles[i] + " ");
		}
		
	}
	
}
		
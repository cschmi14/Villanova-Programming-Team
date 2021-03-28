import java.util.Scanner;
public class AToweringProblem {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int b1 = scan.nextInt();
		int b2 = scan.nextInt();
		int b3 = scan.nextInt();
		int b4 = scan.nextInt();
		int b5 = scan.nextInt();
		int b6 = scan.nextInt();
		int h1 = scan.nextInt();
		int h2 = scan.nextInt();
		int[] boxes = {b1, b2, b3, b4, b5, b6};
		int[] stack1 = orderByDescSize3(findblocks(h1, boxes));
		int[] stack2 = orderByDescSize3(findblocks(h2, boxes));
		for (int i = 0; i < 3; i++) {
			System.out.print(stack1[i] + " ");
		}
		for (int i = 0; i < 3; i++) {
			System.out.print(stack2[i] + " ");
		}
		
	}
	public static int[] findblocks(int h, int[] box) {
		int[] boxNew = new int[3];
		int height = h;
		boolean stop = false;
		for (int i = 0; i < 6 && stop == false; i++) {
			if (height - box[i] > 0) {
				height -= box[i];
				for (int j = i + 1; j < 6 && stop == false; j++) {
					if (height - box[j] > 0) {
						height -= box[j];
						for (int k = j+1; k < 6; k++) {
							if (height - box[k] == 0) {
								boxNew[0] = box[i];
								boxNew[1] = box[j];
								boxNew[2] = box[k];
								stop = true;
							}
						}
						height += box[j];
					}
				}
				height += box[i];
			}

		}
		return boxNew;
	}
	public static int[] orderByDescSize3(int[] arr) {
		int temp = 0;
		int last = arr.length - 1;
		if (arr[0] < arr[1]) {
			temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
		}
		if (arr[last] > arr[last - 1]) {
			temp = arr[last];
			arr[last] = arr[last - 1];
			arr[last-1] = temp;
			if (arr[last-1] > arr[0]) {
				temp = arr[last - 1];
				arr[last - 1] = arr[0];
				arr[0] = temp;
			}
		}
		return arr;
	}
}

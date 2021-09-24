import java.util.*;
public class Recount {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		String word = "";
		
		List<String> list = new ArrayList<String>();
		Map<Integer, String> freqs = new HashMap<Integer, String>();
		while (!(word.equals("***"))) {
			
			word = scan.nextLine();
			list.add(word);
		}
		
		
		scan.close();
		
		list.remove(list.size() - 1);
		Collections.sort(list);
		
		word = list.get(0);
		freqs.put(Collections.frequency(list, word), word);
		
		for (int i = 1; i < list.size(); i++) {
			word = list.get(i);
			if (list.get(i) == list.get(i - 1) ) {
				list.remove(i);
			}
			else {
				freqs.put(Collections.frequency(list, word), word);
			}
		}
		List<Integer> val = new ArrayList<Integer>(freqs.keySet());
		Collections.sort(val);
		Collections.reverse(val);
		
		for (int i = 0; i < val.size(); i++) {
			System.out.println(val.get(i));
		}
		
		if (val.get(0) == val.get(1)) {
			System.out.println("Runoff!");
			return;
		}
		
		System.out.println(freqs.get(val.get(1)));
		
		
	}
    
}

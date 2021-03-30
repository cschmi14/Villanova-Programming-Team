import java.util.*;
public class OddManOut {
    
    public static int HowManyTimes(List<Integer> list, Integer o) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == o)
                count++;
        }
        return count;
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        int ppl;
        String[] numsS;
        List<Integer> nums = new ArrayList<Integer>();
        int odd = 0, count = 1;
        
        while (cases > 0) {
            
            ppl = scan.nextInt();
            
            scan.nextLine();
            
            numsS = (scan.nextLine()).split(" ");
            
            for (int i = 0; i < numsS.length; i++) {
            
                nums.add(Integer.parseInt(numsS[i]));
            
            }
                
            for (int j = 0; j < nums.size(); j++) {
                
                if (HowManyTimes(nums, nums.get(j)) == 1)
                    odd = nums.get(j);
               
            }
            
            System.out.println("Case #" + count + ": " + odd);
            nums.clear();
            count++;
            cases--;
        }
    
    }

}
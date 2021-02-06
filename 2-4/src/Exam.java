import java.util.Scanner;
public class Exam {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int same = 0;
        String me = scan.next();
        String friend = scan.next();
        
        for (int i = 0; i < me.length(); i++) {
            if (me.charAt(i) == friend.charAt(i)) {
                same++;
            }
        }   
        
        int right = 0;
        
        if (k > same) {
            right += same;
            right += ((me.length() - same) - (k - same));
        }
        
        else if (k == same) {
            right = me.length();
        }
        
        else if (k < same) {
            right += k;
            right += (me.length() - same);
        }
        
        System.out.println(right);
       
    }

}
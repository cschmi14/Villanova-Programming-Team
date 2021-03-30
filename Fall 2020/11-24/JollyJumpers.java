import java.util.*;
public class JollyJumpers {

    public static void main(String args[]) {
    
        Scanner scan = new Scanner(System.in);
        List<Integer> set = new ArrayList<Integer>();
        List<Integer> num = new ArrayList<Integer>();
        String line = "";
        boolean t = false;
        String[] lines;
        
        while (scan.hasNextLine()) {
           line = scan.nextLine();
           num.clear();
           set.clear();
           lines = line.split(" ");
           
           for (int i = 0; i < lines.length; i++) {
               num.add(Integer.parseInt(lines[i]));
           }
           num.remove(0);
           
           for (int i = 0; i < num.size() - 1; i++) {
               set.add(Math.abs(num.get(i + 1) - num.get(i)));
           }
           
           for (int i = 1; i < num.size(); i++) {
               if (set.contains(i) == false) {
                   System.out.println("Not jolly");
                   t = true;
                   i = set.size();
               }
           }
           if (t == false) {
               System.out.println("Jolly");
           }
           t = false;
        }
    
    }

}
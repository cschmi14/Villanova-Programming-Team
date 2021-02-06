import java.util.*;
public class RoamingRomans {

   public static void main(String[] args) {
       
       Scanner scan = new Scanner(System.in);
       double miles = scan.nextDouble();
       double feet = miles * 5280;
       double rom = feet / 4854;
       double rompac = rom * 1000;
       if (rompac - Math.floor(rompac) >= 0.5)
           System.out.println((int)Math.ceil(rompac));
       else
           System.out.println((int)Math.floor(rompac));
   
   }

}
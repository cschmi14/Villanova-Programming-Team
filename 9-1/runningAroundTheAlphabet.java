import java.util.Scanner;
public class runningAroundTheAlphabet {
    public static void main(String[] args) {
    
    double s; //arc length
    double circPercent;
    int numValue;
    double time;
    char letter;
    int aph;
    char letter2;
    double letterDif;
    int length;
    double finalTime = 0;
    final double CIRC = (60 * Math.PI);
    double directLength = 0;
    String str;
    String sentence;
    Scanner scan = new Scanner(System.in);
    int n = 0; //character position
    for (aph = scan.nextInt(); aph >= 0; aph--) {
        sentence = scan.nextLine(); 
        length = sentence.length();
        str = sentence.replace(' ', '_');
        str = str.replace("'", "`");
        str = str.toLowerCase();
        n = 0;
        finalTime = 0;
        while (n < (length - 1)) {
           letter = str.charAt(n);
           letter2 = str.charAt(n + 1);
           letterDif = Math.abs(letter - letter2);
           if (letterDif > 14)
               letterDif = 28 - letterDif;
           circPercent = letterDif / 28;
           s = circPercent * CIRC;
           time = (s / 15) + 1;
           finalTime = time + finalTime;
           n++;
           }
    finalTime++;
    if (finalTime > 1)
    System.out.println(finalTime);
    }
    
    }
}
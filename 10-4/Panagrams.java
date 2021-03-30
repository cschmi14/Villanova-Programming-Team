import java.util.Scanner;
public class Panagrams {

    public static void main(String[] args) {
        String str = "";
        String strMis = "";
        String str1 = "";
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int c = n;
        for (n = n; n > 0; n--) {
            if (c == n)
                str1 = scan.nextLine();
            str = scan.nextLine();
            str = str.toUpperCase();
            strMis = "";
             if (str.indexOf("A") == -1)
                 strMis = strMis + "A";
             if (str.indexOf("B") == -1)
                 strMis = strMis + "B";
             if (str.indexOf("C") == -1)
                 strMis = strMis + "C";
             if (str.indexOf("D") == -1)
                 strMis = strMis + "D";
             if (str.indexOf("E") == -1)
                 strMis = strMis + "E";
             if (str.indexOf("F") == -1)
                 strMis = strMis + "F";
             if (str.indexOf("G") == -1)
                 strMis = strMis + "G";
             if (str.indexOf("H") == -1)
                 strMis = strMis + "H";
             if (str.indexOf("I") == -1)
                 strMis = strMis + "I";
             if (str.indexOf("J") == -1)
                 strMis = strMis + "J";
             if (str.indexOf("K") == -1)
                 strMis = strMis + "K";
             if (str.indexOf("L") == -1)
                 strMis = strMis + "L";
             if (str.indexOf("M") == -1)
                 strMis = strMis + "M";
             if (str.indexOf("N") == -1)
                 strMis = strMis + "N";
             if (str.indexOf("O") == -1)
                 strMis = strMis + "O";
             if (str.indexOf("P") == -1)
                 strMis = strMis + "P";
             if (str.indexOf("Q") == -1)
                 strMis = strMis + "Q";
             if (str.indexOf("R") == -1)
                 strMis = strMis + "R";
             if (str.indexOf("S") == -1)
                 strMis = strMis + "S";
             if (str.indexOf("T") == -1)
                 strMis = strMis + "T";
             if (str.indexOf("U") == -1)
                 strMis = strMis + "U";
             if (str.indexOf("V") == -1)
                 strMis = strMis + "V";
             if (str.indexOf("W") == -1)
                 strMis = strMis + "W";
             if (str.indexOf("X") == -1)
                 strMis = strMis + "X";
             if (str.indexOf("Y") == -1)
                 strMis = strMis + "Y";
             if (str.indexOf("Z") == -1)
                 strMis = strMis + "Z";
             if (strMis.equals(""))
                 System.out.println("pangram");   
             else
                 System.out.println("missing " + strMis.toLowerCase());
             c = 0;
        }
    }
 
}
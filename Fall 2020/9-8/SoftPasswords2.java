import java.util.Scanner;
public class SoftPasswords2 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String p, s;
    boolean t = true;
    p = scan.nextLine();
    s = scan.nextLine();
    s.replace(" ", "_");
    p.replace(" ", "_");
    if (s.equals(p))
        System.out.println("Yes");
    else if (p.equals("0" + s))
        System.out.println("Yes");
    else if (p.equals("1" + s))
        System.out.println("Yes");
    else if (p.equals("2" + s))
        System.out.println("Yes");
    else if (p.equals("3" + s))
        System.out.println("Yes");
    else if (p.equals("4" + s))
        System.out.println("Yes");
    else if (p.equals("5" + s))
        System.out.println("Yes");
    else if (p.equals("6" + s))
        System.out.println("Yes");
    else if (p.equals("7" + s))
        System.out.println("Yes");
    else if (p.equals("8" + s))
        System.out.println("Yes");
    else if (p.equals("9" + s))
        System.out.println("Yes");
    else if (p.equals(s + "0"))
        System.out.println("Yes");
    else if (p.equals(s + "1"))
        System.out.println("Yes");
    else if (p.equals(s + "2"))
        System.out.println("Yes");
    else if (p.equals(s + "3"))
        System.out.println("Yes");
    else if (p.equals(s + "4"))
        System.out.println("Yes");
    else if (p.equals(s + "5"))
        System.out.println("Yes");
    else if (p.equals(s + "6"))
        System.out.println("Yes");
    else if (p.equals(s + "7"))
        System.out.println("Yes");
    else if (p.equals(s + "8"))
        System.out.println("Yes");
    else if (p.equals(s + "9"))
        System.out.println("Yes");
    else
        t = false;
    char[] charArray = s.toCharArray();
    for (int i = 0; i < charArray.length; i++) {
        if (Character.isUpperCase(charArray[i])) {
            charArray[i] = Character.toLowerCase(charArray[i]);
            }
        else if (Character.isLowerCase(charArray[i])) {
            charArray[i] = Character.toUpperCase(charArray[i]);
            }
    }
    s = new String(charArray);
    if (s.equals(p))
        System.out.println("Yes");
    else if (!t)
        System.out.println("No");
    }
}
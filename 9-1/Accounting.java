import java.util.Scanner;
import java.util.List;
import java.util.*;
public class Accounting {
    public static void main(String[] args) {
    
    List<Integer> clients = new ArrayList<Integer>();
    List<Integer> clientsr = new ArrayList<Integer>();
    int client = 1;
    int c = 0;
    int n;
    int lines;
    int balance = 0;
    int d = 0;
    int l;
    String print = "print";
    String set = "set";
    String restart = "restart";
    String command = "hi";
    Scanner scan = new Scanner(System.in);
    n = scan.nextInt();
    while (c <= n) {
        clients.add(0);
        c++;
        }
    clientsr = clients;
    for (lines = scan.nextInt(); lines > 0; lines--) {
        command = scan.next();
        command = command.toLowerCase();
        if (command.equals(print)) {
            client = scan.nextInt();
            System.out.println(clients.get(client));
            }
        if (command.equals(set)) {
            client = scan.nextInt();
            balance = scan.nextInt();
            clients.set(client, balance);
            }
        if (command.equals(restart)) {
            clients = clientsr;
            clients.forEach(clients.get(l) = scan.nextInt());
            }
        c = 0;
        d = 0;
        }
    }
}
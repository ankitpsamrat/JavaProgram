import java.util.Scanner;

public class ascii_value {
    public static void main(String args[]) { // ascii value of any english word
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char chr = sc.next().charAt(0);
        int asciiValue = chr;
        System.out.println("ASCII value of " + chr + " is: " + asciiValue);
        sc.close();
    }
}

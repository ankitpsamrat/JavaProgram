import java.util.Scanner;

public class reverse_string {
    public static void main(String[] arg) { // reverse of any string
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        str = sc.nextLine();
        char[] ch = str.toCharArray(); // use array
        System.out.print("Reverse is : ");
        int j = ch.length;
        for (int i = j; i > 0; i--) {
            System.out.print(ch[i - 1]);
        }
        sc.close();
    }
}

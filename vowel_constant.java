import java.util.Scanner;

public class vowel_constant {

    public static void main(String[] arg) {   // using switch case
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                i++;
        }
        if (i == 1)
            System.out.println("Entered character is Vowel");
        else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            System.out.println("Entered character is Consonent");
        else
            System.out.println("Not an alphabet");
        sc.close();
    }
}
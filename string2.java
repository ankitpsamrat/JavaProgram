import java.util.Scanner;

public class string2 {
    public static void main(String[] args) { // print any string in lowercase
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String a = sc.nextLine();
        System.out.print(a.toLowerCase());
        sc.close();
    }
}

import java.util.Scanner;

public class positive_negative {
    public static void main(String[] args) { // check number is positive or negative
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Number is positive");
        } else if (num < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
        sc.close();
    }
}

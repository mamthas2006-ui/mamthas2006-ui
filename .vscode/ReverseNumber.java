import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int rev = 0, rem;

        while (n != 0) {
            rem = n % 10;          // get last digit
            rev = rev * 10 + rem; // add digit to reverse
            n = n / 10;           // remove last digit
        }

        System.out.println("Reversed number: " + rev);
    }
}

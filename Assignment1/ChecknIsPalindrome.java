import java.util.Scanner;
//Problem10
public class ChecknIsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number");
        int n = sc.nextInt();

        int originaln = n;
        int reversedn = 0;

       
        while (n != 0) {
            int digit = n % 10;
            reversedn = reversedn * 10 + digit;
            n /= 10;
        }

        if (originaln == reversedn) {
            System.out.println(originaln + " is a palindrome.");
        } else {
            System.out.println(originaln + " is not a palindrome.");
        }
    }
}

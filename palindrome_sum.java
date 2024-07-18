import java.util.Scanner;

public class ReverseAndAddPalindrome {
    // Function to reverse the digits of a number
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    // Function to check if a number is palindrome
    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = reverseNumber(num);
        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        sc.close();

        int original = input;
        int reverse = reverseNumber(input);
        int sum = original + reverse;

        while (!isPalindrome(sum)) {
            System.out.printf("%d + %d = %d%n", original, reverse, sum);
            original = sum;
            reverse = reverseNumber(sum);
            sum = original + reverse;
        }

        System.out.printf("%d + %d = %d%n", original, reverse, sum);
        System.out.println("Palindrome found: " + sum);
    }
}

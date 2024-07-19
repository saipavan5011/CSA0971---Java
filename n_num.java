import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        try {
            n = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
            return;
        }

        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            try {
                arr[i] = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input");
                return;
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            try {
                sum += arr[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds");
                return;
            }
        }

        System.out.println("Sample Output : " + sum);
    }
}

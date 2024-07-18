import java.util.Scanner;

public class StudentUsersCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the total number of users and the number of staff users
        System.out.print("Enter total users: ");
        int totalUsers = scanner.nextInt();
        System.out.print("Enter staff users: ");
        int staffUsers = scanner.nextInt();

        // Calculate the number of non-teaching staff users
        int nonTeachingStaffUsers = staffUsers / 3;

        // Calculate the number of student users
        int studentUsers = totalUsers - staffUsers - nonTeachingStaffUsers;

        // Print the result
        System.out.println("Student Users: " + studentUsers);
    }

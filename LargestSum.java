package exam;
import java.util.Scanner;

public class LargestSum {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the largest number
        int largest = num1;

        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        // Calculate the sum of the largest number
        int sum = largest * 3;

        // Display the sum
        System.out.println("The sum of the largest number (repeated 3 times) is: " + sum);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}

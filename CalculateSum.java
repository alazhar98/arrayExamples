import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = in.nextLine();

        int result = sumDigits(input);
        System.out.println("Sum of digits: " + result);

        in.close();
    }

    /*
    Initialize the sum with 0.
    Go through the string character by character and check if the character is a digit.
    The sum is equal to the sum of the digit numbers in the string.
    */
    public static int sumDigits(String str) {
        int sum = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                // Subtract '0' to convert char to its numeric value
                sum += ch - '0'; // More efficient way to get the numeric value
            }
        }
        return sum;
    }
}

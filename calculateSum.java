import java.util.Scanner;

public class calculateSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = in.nextLine();

        int result = sumDigits(input);
        System.out.println("Sum of digits: " + result);

        in.close();
    }
/*
initialize the sum with 0
go through the string character by character and check if character is digit
then the sum is equal to the sum of the digit number in the string
 */
    public static int sumDigits(String str) {
        int sum = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }
        return sum;
    }
}

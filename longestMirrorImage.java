import java.util.Scanner;

public class longestMirrorImage {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = in.nextLine(); // Read user input

        String result = mirror(input);
        System.out.println("Mirror ends: " + result);

        in.close();
    }
    /*
    i initialize length of the string
    i make new array for new String
    i make for loop that go through the array of characters and check if the character is equal character on the next side
    append it to the new array
     */
    public static String mirror(String str){
        int length = str.length();
        StringBuilder result = new StringBuilder();

        // Check for mirror characters from both ends
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == str.charAt(length - 1 - i)) {
                result.append(str.charAt(i));
            } else {
                break;
            }
        }

        return result.toString();
    }
}


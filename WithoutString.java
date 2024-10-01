import java.util.Scanner;

public class WithoutString {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base string: ");
        String base = in.nextLine();

        System.out.print("Enter the string to remove: ");
        String remove = in.nextLine();

        String result = withoutString(base, remove);
        System.out.println("Resulting string: " + result);

        in.close();
    }
    /*
    I Check if the substring starting at the current index matches 'remove'
    If it matches, skip the length of the 'remove' substring
    Otherwise, append the current character to the result

     */

    public static String withoutString(String base ,String remove){
        StringBuilder result = new StringBuilder();
        int i = 0;
        int removeLength = remove.length();

        while (i < base.length()) {

            if (i <= base.length() - removeLength && base.substring(i, i + removeLength).equalsIgnoreCase(remove)) {

                    i += removeLength;
            } else {

                result.append(base.charAt(i));
                i++;
            }
        }

        return result.toString();
    }
}

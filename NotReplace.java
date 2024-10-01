public class NotReplace {
    public static void main(String[] args){
        System.out.println(notReplace("is test"));
        System.out.println(notReplace("is-is"));
        System.out.println(notReplace("This is right"));
        System.out.println(notReplace("This is not"));
        System.out.println(notReplace("is"));
    }

    public static String notReplace(String str){
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            // Check if the substring "is" is found
            if (i <= str.length() - 2 && str.substring(i, i + 2).equals("is")) {
                // Check the characters before and after "is"
                char prevChar = (i == 0) ? ' ' : str.charAt(i - 1);
                char nextChar = (i + 2 < str.length()) ? str.charAt(i + 2) : ' ';

                if (!Character.isLetter(prevChar) && !Character.isLetter(nextChar)) {
                    // Replace is with is not
                    result.append("is not");
                    i += 2; // Move past "is"
                    continue;
                }
            }

            // Append the current character to the result
            result.append(str.charAt(i));
            i++;
        }

        return result.toString();
    }

}

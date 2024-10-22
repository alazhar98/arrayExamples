import java.util.Stack;

public class CheckForDuplicate {

    public static void main(String[] args) {
        String str1 = "((a+b)+(c+d))";
        String str2 = "((a+b))";

        System.out.println(containsDuplicateParentheses(str1)); // Output: false
        System.out.println(containsDuplicateParentheses(str2)); // Output: true
    }

    /*
    if character is ) then check for duplicates if there are other )
    Pop all characters until we find a matching
    Pop the matching (
    Push any other character onto the stack
    if no duplicates found then false

     */
    public static boolean containsDuplicateParentheses(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {

            if (ch == ')') {

                if (!stack.isEmpty() && stack.peek() == '(') {
                    return true;
                }


                while (!stack.isEmpty() && stack.peek() != '(') {
                    stack.pop();
                }


                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {

                stack.push(ch);
            }
        }

        return false;
    }
}

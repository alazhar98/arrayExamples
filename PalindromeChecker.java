import java.util.Stack;

public class PalindromeChecker {
    public static void main(String[] args) {
        String input = "racecar";
        System.out.println("the string is Palindrome: "+isPalindrome(input));
    }

    /*
     Push all characters onto the stack
     Compare characters with the original string
     If characters don't match, it's not a palindrome return false
     If match return true
     */
    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<str.length();i++){
            stack.push(str.charAt(i));

        }
        for (int i=0;i<str.length();i++){
            if (stack.pop()!= str.charAt(i)){
                return false;
            }
        }
        return true;
    }
}

import java.util.Stack;

public class StringReverser {

    public static void main(String[] args) {
        String input = "hello";
        String output = reverseString(input);
        System.out.println(output);
    }
    public static String reverseString(String str){
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()){
            stack.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();

    }
}

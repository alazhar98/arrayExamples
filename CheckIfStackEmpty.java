import java.util.Stack;

public class CheckIfStackEmpty {

    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();

        numbers.push(1);
        numbers.pop();
        System.out.println(numbers.isEmpty());
    }

}

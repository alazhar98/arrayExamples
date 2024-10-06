import java.util.Stack;

public class ImplementStack {
    public static void main(String[] args){
        Stack<Integer> numbers = new Stack<>();

        numbers.push(10);
        numbers.push(20);
        numbers.push(30);
        System.out.println("After push:"+numbers);
        numbers.pop();
        System.out.println("After pop:"+numbers);
        numbers.peek();
        System.out.println("After peek:"+numbers);


    }
}

import java.util.ArrayList;

public class ImplementStack {

    static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        pop();
        peek();
        System.out.println("is Empty:" + numbers.isEmpty());


    }

    public static void push(Integer item) {
        numbers.addFirst(item);
    }


    public static void pop() {
        Integer firstnum = numbers.getFirst();
        numbers.remove(0);
        System.out.println("pop:" + firstnum);
    }

    public static void peek() {
        Integer firstnum = numbers.getFirst();
        System.out.println("peek: "+firstnum);
    }

    public boolean isEmpty() {
        return numbers.isEmpty();
    }
}



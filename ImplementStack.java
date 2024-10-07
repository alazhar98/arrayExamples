import java.util.Stack;

public class ImplementStack {
    private int[] stackArray;
    private int top;
    private int capacity;

    public static void main(String[] args){
        ImplementStack numbers = new ImplementStack(4);

        numbers.push(10);
        numbers.push(20);
        numbers.push(30);
        System.out.println("pop:"+numbers.pop());
        System.out.println("peek:"+numbers.peek());

        System.out.println("is Empty:"+numbers.isEmpty());


    }
    public ImplementStack (int size){
        stackArray=new int[size];
        capacity=size;
        top=-1; // now stack is at initial is empty
    }
    public void push(int item){
        if(top == capacity-1){
            System.out.println("overflow");
            return;
        }
        stackArray[++top]=item;

    }
    public int pop(){
        return stackArray[top--];
    }
    public int peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return top==-1;
    }

}

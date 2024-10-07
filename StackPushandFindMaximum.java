import java.util.Stack;

public class StackPushandFindMaximum {
    static Stack<Integer> mainStack = new Stack<Integer> ();
    static Stack<Integer> trackStack = new Stack<Integer> ();
/*
if current element is greater than the top element push current element to trackStack
otherwise push the element to the top
 */
    static void push(int x) {
        mainStack.push(x);
        if (mainStack.size() == 1) {
            trackStack.push(x);
            return;
        }
        if (x > trackStack.peek())
            trackStack.push(x);
        else
            trackStack.push(trackStack.peek());
    }
    static int getMax()
    {
        return trackStack.peek();
    }
    static void pop()
    {
        mainStack.pop();
        trackStack.pop();
    }
    public static void main(String[] args)
    {
        StackPushandFindMaximum s = new StackPushandFindMaximum();
        s.push(20);
        s.push(10);
        s.push(50);
        System.out.println("The max element is:"+s.getMax());
    }


}

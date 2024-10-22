import java.util.ArrayList;
import java.util.HashSet;

public class FirstRepeatedElement {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(2);
        input.add(5);
        input.add(1);
        input.add(2);
        input.add(3);

        Integer result = findFirstRepeated(input);
        if (result != null) {
            System.out.println("Output: " + result);
        } else {
            System.out.println("No repeated elements found.");
        }
    }
    //Check if the number has already been seen
    // return num ---> return the first repeated element
    // add the current number to the set
    // return null --> if no element is repeated
    public static Integer findFirstRepeated(ArrayList<Integer> nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            if (numbers.contains(num)) {
                return num;
            }
            numbers.add(num);
        }
        return null;
    }
}

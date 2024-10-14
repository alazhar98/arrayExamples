import java.util.ArrayList;
import java.util.HashSet;

public class FindPairWithSum {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(4);
        input.add(5);
        input.add(7);

        int target = 6;

        boolean result = hasPairWithSum(input, target);
        System.out.println("Output: " + result);

    }
    // Calculate the complement (target-num)
    // if found pair by check if the numbers contains the complements return true


    public static boolean hasPairWithSum(ArrayList<Integer> nums, int target) {
        // Check every pair of numbers
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }
}

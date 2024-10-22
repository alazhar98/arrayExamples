import java.util.HashMap;
import java.util.List;

public class ContainsNearbyDuplicate {
    public static void main(String[] args) {
        List<Integer> input1 = List.of(1, 2, 3, 1);
        int k1 = 3;
        boolean result1 = containsNearbyDuplicate(input1, k1);
        System.out.println("Output: " + result1);

    }

    public static boolean containsNearbyDuplicate(List<Integer> nums, int k) {
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j <= Math.min(i + k, nums.size() - 1); j++) {
                if (nums.get(i).equals(nums.get(j))) {
                    return true; // Found duplicate
                }
            }
        }
        return false; // No duplicates
    }
}

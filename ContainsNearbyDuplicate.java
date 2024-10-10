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
        HashMap<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < nums.size(); i++) {
            if (indexMap.containsKey(nums.get(i))) {
                int lastIndex = indexMap.get(nums.get(i));
                // Check if the absolute difference of indices is <= k
                if (Math.abs(i - lastIndex) <= k) {
                    return true; // Found a duplicate within the index range
                }
            }
            // Update the index of the current number
            indexMap.put(nums.get(i), i);
        }

        return false; // No duplicates found within the range
    }
}

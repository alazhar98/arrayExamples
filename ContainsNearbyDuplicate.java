
import java.util.HashSet;
import java.util.List;

public class ContainsNearbyDuplicate {
    public static void main(String[] args) {
        List<Integer> input1 = List.of(1, 2, 3, 1);
        int k1 = 3;
        boolean result1 = containsNearbyDuplicate(input1, k1);
        System.out.println("Output: " + result1);

        List<Integer> input2 = List.of(1, 0, 1, 1);
        int k2 = 1;
        boolean result2 = containsNearbyDuplicate(input2, k2);
        System.out.println("Output: " + result2);

        List<Integer> input3 = List.of(1, 2, 3, 1, 2, 3);
        int k3 = 2;
        boolean result3 = containsNearbyDuplicate(input3, k3);
        System.out.println("Output: " + result3);
    }

    public static boolean containsNearbyDuplicate(List<Integer> nums, int k) {
        HashSet<Integer> seen = new HashSet<>();

        for (int i = 0; i < nums.size(); i++) {

            if (i > k) {
                seen.remove(nums.get(i - k - 1)); // Remove the element that's out of the window
            }

            // Check if the current number is already in the set
            if (!seen.add(nums.get(i))) {
                return true; // Found a duplicate
            }
        }

        return false; // No duplicates found
    }
}

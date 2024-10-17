import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DistinctElementsInWindow {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;

        List<Integer> result = countDistinctInSlidingWindow(arr, k);
        System.out.println("Output: " + result);
    }
/*
Return empty if window size is greater than array length or invalid
Remove the element going out of the window
Add the new element coming into the window
Store the count of distinct elements
 */
    public static List<Integer> countDistinctInSlidingWindow(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        if (arr.length < k || k <= 0) {
            return result;
        }

        HashSet<Integer> set = new HashSet<>();


        for (int i = 0; i < k; i++) {
            set.add(arr[i]);
        }
        result.add(set.size());


        for (int i = k; i < arr.length; i++) {
            set.remove(arr[i - k]);
            set.add(arr[i]);
            result.add(set.size());
        }

        return result;
    }
}

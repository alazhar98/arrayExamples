import java.util.ArrayList;
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
Assuming input numbers are in the range [1, 100]
Slide the window
Remove the first element of the previous window
 */
    public static List<Integer> countDistinctInSlidingWindow(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        if (arr.length < k || k <= 0) {
            return result;
        }

        int[] count = new int[101];
        int distinctCount = 0;


        for (int i = 0; i < k; i++) {
            if (count[arr[i]] == 0) {
                distinctCount++;
            }
            count[arr[i]]++;
        }
        result.add(distinctCount);


        for (int i = k; i < arr.length; i++) {
            // Add the next element
            if (count[arr[i]] == 0) {
                distinctCount++;
            }
            count[arr[i]]++;
            count[arr[i - k]]--;
            if (count[arr[i - k]] == 0) {
                distinctCount--;
            }

            result.add(distinctCount);
        }

        return result;
    }
}

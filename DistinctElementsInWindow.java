import java.util.ArrayList;

public class DistinctElementsInWindow {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        ArrayList<Integer> result = countDistinctInWindow(arr, k);
        System.out.println("Output: " + result);
    }

    public static ArrayList<Integer> countDistinctInWindow(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        int[] count = new int[10];


        for (int i = 0; i < k; i++) {
            count[arr[i]]++;
        }

        result.add(countDistinct(count));

        for (int i = k; i < arr.length; i++) {

            count[arr[i]]++;

            count[arr[i - k]]--;


            result.add(countDistinct(count));
        }

        return result;
    }

    private static int countDistinct(int[] count) {
        int distinctCount = 0;
        for (int i = 1; i < count.length; i++) {
            if (count[i] > 0) {
                distinctCount++;
            }
        }
        return distinctCount;
    }
}

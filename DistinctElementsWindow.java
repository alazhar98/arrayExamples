import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DistinctElementsWindow {
    public static void main(String[] args){
        int[] arr = {1, 5, 7, -1, 5};
        int k =3;
        List<Integer> result = countDistinctInSlidingWindow(arr, k);
        System.out.println("Output: " + result);
    }
    /*
    Initialize the first window
     Count for the first window
     Slide the window across the array
     Remove the element going out of the window
     Add the new element coming into the window
     Add the count of distinct elements for the current window
     */
    public static List<Integer> countDistinctInSlidingWindow(int[] arr, int k) {
        List<Integer> distinctCounts = new ArrayList<>();
        HashSet<Integer> uniqueElements = new HashSet<>();

        for (int i = 0; i < k; i++) {
            uniqueElements.add(arr[i]);
        }
        distinctCounts.add(uniqueElements.size());

        for (int i = k; i < arr.length; i++) {
            uniqueElements.remove(arr[i - k]);
            uniqueElements.add(arr[i]);
            distinctCounts.add(uniqueElements.size());
        }
        return distinctCounts;
    }
}
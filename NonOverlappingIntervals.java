import java.util.Arrays;
import java.util.HashSet;

public class NonOverlappingIntervals {
    public static void main(String[] args){
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int result = maxNonOverlappingIntervals(intervals);
        System.out.println("Output: " + result);
    }
    /*
    Sort intervals by their end times
     If the start time is greater than or equal to the last end time then , Track the start time and Track the end time
     and increment the count an update the last end time
     Return the maximum count of non-overlapping intervals
     */
    public static int maxNonOverlappingIntervals(int[][] intervals){
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        HashSet<Integer> selectedIntervals = new HashSet<>();

        int count = 0;
        int lastEndTime = Integer.MIN_VALUE;

        for (int[] interval : intervals) {
            // If the start time is greater than or equal to the last end time
            if (interval[0] >= lastEndTime) {
                selectedIntervals.add(interval[0]); // Track the start time (optional)
                selectedIntervals.add(interval[1]); // Track the end time
                count++; // Select this interval
                lastEndTime = interval[1]; // Update the last end time
            }
        }
        System.out.println("Selected intervals: " + selectedIntervals);

        return count; // Return the maximum count of non-overlapping intervals
    }

}

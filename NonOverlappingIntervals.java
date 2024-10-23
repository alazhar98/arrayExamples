import java.util.*;

public class NonOverlappingIntervals {
    public static void main(String[] args){
        List<List<Integer>> intervals = new ArrayList<>(List.of(
                List.of(1, 2),
                List.of(2, 3),
                List.of(3, 4),
                List.of(1, 3)
        ));
        maxNonOverlappingIntervals(intervals);
        }
    /*
    Sort intervals by their end times
     If the start time is greater than or equal to the last end time then , Track the start time and Track the end time
     and increment the count an update the last end time
     Return the maximum count of non-overlapping intervals
     */
    public static void maxNonOverlappingIntervals(List<List<Integer>> intervals){
        Collections.sort(intervals, (a, b) -> a.get(1) - b.get(1));
        System.out.println(intervals);
        Set<List<Integer>> selectedIntervals = new HashSet<>();

        int previousEnd = 0;
        int lastEndTime = Integer.MIN_VALUE;

        for (List<Integer> num : intervals) {
            int start = num.get(0);
            int end = num.get(1);

            if (start >= previousEnd) {
                selectedIntervals.add(num);
                previousEnd = end;
            }

        }
        System.out.println("Non-Overlapping Intervals " + selectedIntervals);
        System.out.println("number of Non-Overlapping Intervals= " + selectedIntervals.size());
        System.out.println("Selected intervals: " + selectedIntervals);


    }


}

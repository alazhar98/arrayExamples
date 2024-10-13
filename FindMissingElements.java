import java.util.ArrayList;
import java.util.List;

public class FindMissingElements {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 3, 5, 7);
        int lower = 1;
        int upper = 10;

        List<Integer> result = findMissingRanges(nums, lower, upper);
        System.out.println("Missing numbers: " + result);
    }
    /*
    to track the current i put current = lower
    i make for loop in the list numbers
    i make while loop to check for missing numbers before the current number
    move the current number to the next number in the list
    i make another while loop to check if there is any remaining numbers up to the upper
    
     */
    public static List<Integer> findMissingRanges(List<Integer> nums, int lower, int upper) {
        List<Integer> missingNums= new ArrayList<>();
        int current = lower;

        for (int num:nums){
            while (current<num){
                missingNums.add(current);
                current++;


            }
            current=num+1;
        }
        while (current<=upper){
            missingNums.add(current);
            current++;
        }
        return missingNums;
    }


}

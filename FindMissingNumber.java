import java.util.ArrayList;
import java.util.HashSet;
public class FindMissingNumber {
    public static void main(String[] args){
        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(3);
        inputList.add(0);
        inputList.add(1);

        int missingNumber = findMissingNumber (inputList);
        System.out.println("Missing number: " + missingNumber);
    }
    //n is Size of the ArrayList
    // i create i Hashset
    // add all numbers from 0 to n to the set
    // remove elements found in the ArrayList from the set
    // remaining element in the set is the missing number
    public static int findMissingNumber (ArrayList<Integer> nums){
        int n = nums.size();
        HashSet<Integer> setOfnumber = new HashSet<>();
        for (int i = 0; i <= n; i++) {
            setOfnumber.add(i);
        }
        for (int num : nums) {
            setOfnumber.remove(num);
        }
        return setOfnumber.iterator().next();


    }
}

import java.util.ArrayList;
import java.util.HashMap;

public class ContainsNearbyDuplicate {
    public static void main(String[] args){
        ArrayList<Integer> input1 = new ArrayList<>();
        input1.add(1);
        input1.add(2);
        input1.add(3);
        input1.add(1);

        int k1 = 3;
        boolean result1 = containsNearbyDuplicate(input1, k1);
        System.out.println("Output: " + result1);

        ArrayList<Integer> input2 = new ArrayList<>();
        input2.add(1);
        input2.add(0);
        input2.add(1);
        input2.add(1);

        int k2 = 1;
        boolean result2 = containsNearbyDuplicate(input2, k2);
        System.out.println("Output: " + result2);

        ArrayList<Integer> input3 = new ArrayList<>();
        input3.add(1);
        input3.add(2);
        input3.add(3);
        input3.add(1);
        input3.add(2);
        input3.add(3);

        int k3 = 2;
        boolean result3 = containsNearbyDuplicate(input3, k3);
        System.out.println("Output: " + result3);
    }

    
    //Check if the number already exists in the map
    //Check if the difference between them is k
    // return true if Found a duplicate within index range
    //Update the index of the current number
    // return false if no duplicates found within the range
    public static boolean containsNearbyDuplicate(ArrayList<Integer> nums, int k) {
        HashMap<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < nums.size(); i++) {

            if (indexMap.containsKey(nums.get(i))) {
                int lastIndex = indexMap.get(nums.get(i));

                if (i - lastIndex <= k) {
                    return true;
                }
            }

            indexMap.put(nums.get(i), i);
        }

        return false;
    }

}

import java.util.ArrayList;
import java.util.HashSet;
public class DisjointArrays {
    public static void main(String[] args){
        ArrayList<Integer> Arr1 = new ArrayList<>();
        Arr1.add(1);
        Arr1.add(2);
        Arr1.add(3);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(4);
        arr2.add(5);
        arr2.add(6);

        System.out.println(areDisjoint(Arr1, arr2)); // Output: true

        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.add(1);
        arr3.add(2);
        arr3.add(3);

        ArrayList<Integer> arr4 = new ArrayList<>();
        arr4.add(3);
        arr4.add(4);
        arr4.add(5);

        System.out.println(areDisjoint(arr3, arr4));
    }
    // i Create a HashSet to store elements
    // i Check if any element of the second ArrayList is in the HashSet
    // if found any common element return false
    // if no common element found return true
    public static boolean areDisjoint(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        HashSet<Integer> set = new HashSet<>(arr1);
        for (int num : arr2) {
            if (set.contains(num)) {
                return false;
            }
        }
        return true;
    }
}

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

// i make two array list for to arrays
// i add the numbers for two of them
// i make two sets and i add the two arrays for the two sets
// to get intersection i use retainAll
public class IntersectionTwoArrays {
    public static void main(String[] args ){
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(2);
        arr1.add(3);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(2);
        arr2.add(2);

        Set<Integer> setA = new HashSet<>(arr1);
        Set<Integer> setB = new HashSet<>(arr2);


        setA.retainAll(setB);
        System.out.println("intersection:"+setA);
    }
}

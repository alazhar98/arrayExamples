import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UnionTwoArrays {
    public static void main(String[] args){
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


        setA.addAll(setB);
        System.out.println("Union:"+setA);
    }
}


import java.util.ArrayList;
import java.util.HashSet;

public class CheckForDublicatesBySet {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(1);
        System.out.println(hasDuplicates(arr1));
        ArrayList<Integer> arr2= new ArrayList<>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        System.out.println(hasDuplicates(arr2));
    }
    // I make HashSet Name it numbers
    // For every number in the array  add it to t,he HashSet
    // the add return false if the number is already present
    // if duplicates found return true else return false
    public static boolean hasDuplicates(ArrayList<Integer> array){
        HashSet<Integer> numbers= new HashSet<>();

        for (int num:array){
            if(!numbers.add(num)){
                return true;
            }

        }
        return false;
    }
}

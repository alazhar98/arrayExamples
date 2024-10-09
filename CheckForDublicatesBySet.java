import java.util.HashSet;

public class CheckForDublicatesBySet {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 1};
        int[] arr2 = {1, 2, 3};
        System.out.println(hasDuplicates(arr1));
        System.out.println(hasDuplicates(arr2));
    }
    // I make HashSet Name it numbers
    // For every number in the array  add it to the HashSet
    // the add return false if the number is already present
    // if duplicates found return true else return false
    public static boolean hasDuplicates(int[] array){
        HashSet<Integer> numbers= new HashSet<>();

        for (int num:array){
            if(!numbers.add(num)){
                return true;
            }

        }
        return false;
    }
}

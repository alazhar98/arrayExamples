import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

// I make new linkHashset i name it numbers
// I add every number in the array into the linkHashset
// LinkHashset will not change the order for the set
public class UniqueElements {
    public static void main(String[] args){
        Set<Integer> numbers = new LinkedHashSet<>();
        int[] arr ={1,2,3,2,1};
        for(int num:arr){
            numbers.add(num);

        }
        System.out.println("The unique Numbers in the array : "+numbers);


    }
}

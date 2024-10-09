import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

// I make arrayList i add the numbers on it
// I add the arrayList into the set 
// LinkHashset will not change the order for the set
public class UniqueElements {
    public static void main(String[] args){
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(2);
        array.add(1);
        Set<Integer> numbers = new LinkedHashSet<>(array);
        System.out.println("The unique Numbers in the array : "+numbers);


    }
}

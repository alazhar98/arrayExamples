import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordMultiple {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String Spattered by spaces: ");

        String input = scanner.nextLine();
        String[] strings =input.split(" ");
        System.out.println(countWords(strings));

    }
    /*
    for loop for str in strings
    calculate the number of str in strings
    if more than 2 make it true
     */
    public static Map<String,Boolean> countWords(String[] strings){
        Map<String,Integer> count  = new HashMap<>();
        Map<String,Boolean> result = new HashMap<>();

        for (String str : strings){
            count.put(str,count.getOrDefault(str,0)+1);

        }
        for (String k : count.keySet()){
            result.put(k,count.get(k)>=2);
        }
        return result;
    }
}

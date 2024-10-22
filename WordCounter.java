import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter strings (type 'exit' to finish):");

        String input = scanner.nextLine();

        String[] strings = input.split("\\s+");
        Map<String, Integer> result = wordCount(strings);
        System.out.println("Result: " + result);
    }
    public static Map<String, Integer> wordCount(String[] strings){
        Map<String,Integer> count = new HashMap<>();

        //check if already in the map
        for (String str:strings){
            if (count.containsKey(str)){
                //increment count
                count.put(str,count.get(str)+1);

            }
            // put count equal 1
            else {
                count.put(str,1);
            }
        }
        return count;
    }
}

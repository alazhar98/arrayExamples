import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter strings (type 'exit' to finish):");

        // input example : a b a b
        String input = scanner.nextLine();

        String[] strings = input.split("\\s+");
        Map<String, Integer> result = wordLen(strings);
        System.out.println("Result: " + result);
    }
    //make new hashMap
    //for loop for every string in array
    // if the map is not contain str then put str , length of the str
    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> result = new HashMap<>();
        for (String str : strings) {
            if (!result.containsKey(str)) {
                result.put(str, str.length());

            }

        }
        return result;
    }

}

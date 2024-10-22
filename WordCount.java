import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter strings (type 'exit' to finish):");

        // input example : a b a b
        String input = scanner.nextLine();

        String[] strings = input.split("\\s+");
        Map<String, Integer> result = word(strings);
        System.out.println("Result: " + result);
    }
    // make new hashMap
    //for str in string
    // put every str as 0

    public static Map<String, Integer> word(String[] strings){
        Map<String, Integer> result = new HashMap<>();
        for(String str:strings){
            result.put(str,0);

        }
        return result;
    }
}

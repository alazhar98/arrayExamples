import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstCharConcatenation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter strings (type 'exit' to finish):");

        String input = scanner.nextLine();

        String[] strings = input.split("\\s+");
        Map<String, String> result = firstChar(strings);
        System.out.println("Result: " + result);
    }
    public static Map<String, String> firstChar(String[] strings){
        Map<String,String> result = new HashMap<>();

        // check if the user input is not empty
        for (String str :strings){
            if (str.length()>0){
                String firstCharacter = String.valueOf(str.charAt(0));

                // check if the map contain first character
                if (result.containsKey(firstCharacter)){
                    // add all the strings that has same first character
                    result.put(firstCharacter,result.get(firstCharacter)+str);
                }
                else {
                    result.put(firstCharacter,str);
                }
            }
        }
        return result;
    }
}

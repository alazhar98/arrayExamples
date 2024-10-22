import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringPairs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter strings (type 'exit' to finish):");
        String input = scanner.nextLine();

        String[] strings = input.split("\\s+");
        Map<String, String> result = pairs(strings);
        System.out.println("Result: " + result);
    }
    /*
    i make new hasMap
    for loop for every str in the array
    if length is grater than 0 then i found the first and last character for every str
     */
    public static Map<String, String> pairs(String[] strings){
        Map<String,String> result = new HashMap<>();

        for (String str:strings){
            if(str.length()>0){
                String firstCharacter =String.valueOf(str.charAt(0));
                String lastCharacter = String.valueOf(str.charAt(str.length()-1));

                result.put(firstCharacter,lastCharacter);


            }
        }
        return result;
    }

}

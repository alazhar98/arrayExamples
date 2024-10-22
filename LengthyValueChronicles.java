import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LengthyValueChronicles {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Map<String, String> foodMap = new HashMap<>();

        System.out.println("Enter food items and their values (type 'exit' to finish):");

        while (true) {
            System.out.print("Enter key: ");
            String key = scanner.nextLine();
            if (key.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("Enter value: ");
            String value = scanner.nextLine();
            foodMap.put(key, value);
        }

        updateToppingsMap(foodMap);
        System.out.println("Modified map: " + foodMap);

    }
    public static void updateToppingsMap(Map<String, String> map){
        if (map.containsKey("a") && map.containsKey("b")) {
            String valueA = map.get("a");
            String valueB = map.get("b");

            //check if length of a not equal to length of b else make a and b equal to empty

            if (valueA.length()!=valueB.length()){
                String longerValue;

                //check if a length is grater than b length then , the longer value will be a else longer value will be b
                if (valueA.length()>valueB.length()){
                    longerValue=valueA;
                }
                else {
                    longerValue=valueB;
                }
                map.put("c",longerValue);

            }
            else {
                map.put("a","");
                map.put("b","");
            }
        }
    }
}

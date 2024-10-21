import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EqualABGone {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Map<String, String> foodMap = new HashMap<>();

        System.out.println("Enter food items and their toppings  (type 'exit' to finish):");

        while (true) {
            System.out.print("Enter food item (key): ");
            String key = scanner.nextLine();
            if (key.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("Enter topping (value): ");
            String value = scanner.nextLine();

            foodMap.put(key, value);
            }
        updateToppingsMap(foodMap);

        System.out.println(foodMap);
    }

    public static void updateToppingsMap(Map<String, String> map){
        // if map contain keys a and b
        // if value of a equal value of b
        // then remove both
        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").equals(map.get("b"))){
                map.remove("a");
                map.remove("b");
            }

        }
    }
}

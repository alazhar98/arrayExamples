import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class FriesSpinachTropping {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Map<String, String> foodMap = new HashMap<>();

        System.out.println("Enter food items and their toppings :");

        System.out.print("Enter food item (key): ");
        String key = scanner.nextLine();

        System.out.print("Enter topping (value): ");
        String value = scanner.nextLine();

        foodMap.put(key, value);
        updateToppingsMap(foodMap);

        System.out.println(foodMap);
    }
    public static void updateToppingsMap(Map<String, String> map){
        if(map.containsKey("potato")&& map.get("potato")!=null){
            String potatoValue = map.get("potato");
            map.put("fries",potatoValue);
        }
        if(map.containsKey("salad")&& map.get("salad")!=null) {
            String saladValue = map.get("salad");
            map.put("spinach",saladValue);
        }
    }
}

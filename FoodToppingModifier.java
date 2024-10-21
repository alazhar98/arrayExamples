import java.util.HashMap;
import java.util.Map;

public class FoodToppingModifier {
    public static void main(String[] args ){
        Map<String, String> map = new HashMap<>();
        map.put("ice cream", "cherry");
        modifyMap(map);
        System.out.println(map);
    }
    public static void modifyMap(Map<String, String> map){
        // if map contain ice cream put yogurt equal to ice cream
        if (map.containsKey("ice cream") && map.get("ice cream")!=null){
            String value=map.get("ice cream");
            map.put("yogurt",value);
        }
        // if mao contain spinach put spinach equal to nuts
        if(map.containsKey("spinach")){
            map.put("spinach","nuts");
        }
    }
}

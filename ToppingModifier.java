import java.util.HashMap;
import java.util.Map;

public class ToppingModifier {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        map.put("ice cream", "peanuts");
        modifyMap(map);
        System.out.println(map);
    }
    public static void modifyMap(Map<String, String> map){
        if (map.containsKey("ice cream")){
            map.put("ice cream","cherry");

        }
        map.put("bread ","butter");
    }
}

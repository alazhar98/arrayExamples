import java.util.HashMap;
import java.util.Map;

public class MapBully {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();

        map.put("a","candy");
        map.put("b","dirty");
        // if map contain a
        // initialize value to a
        // put b is the value for a "candy"
        // put a is ""
        if (map.containsKey("a")){
            String value = map.get("a");
            map.put("b",value);
            map.put("a","");

        }
        System.out.println(map);
    }
}

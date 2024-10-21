import java.util.HashMap;
import java.util.Map;

public class MapBully {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();

        map.put("a","candy");
        map.put("b","dirty");
        // if map contain a and map get a not equal to null and map get a is not empty
        // initialize value to a
        // put b is the value for a "candy"
        // put a is ""
        if (map.containsKey("a")&& map.get("a")!=null&& !map.get("a").isEmpty()){
            String value = map.get("a");
            map.put("b",value);
            map.put("a","");

        }
        System.out.println(map);
    }
}

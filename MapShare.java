import java.util.HashMap;
import java.util.Map;

public class MapShare {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c", "ccc");
        modifyMap(map);
        System.out.println(map);
    }
    /*
    check if map contains a and map get a not equal to null
    initialize value to a value
    put b to value a (aaa)
    remove c if there

     */
    public static void modifyMap(Map<String, String> map){
        if (map.containsKey("a") && map.get("a") != null) {
            String value = map.get("a");
            map.put("b",value);

        }
        map.remove("c");
    }
}

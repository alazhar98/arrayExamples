import java.util.HashMap;
import java.util.Map;

public class MapAB3 {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("c", "cake");
        modifyMap(map);
        System.out.println(map);
    }
    public static void modifyMap(Map<String, String> map){
        //if a and  not b
        // put value of a to b
        if ((map.containsKey("a")&& map.get("a")!=null)&& !( map.containsKey("b") && map.get("b") != null)){
            map.put("b",map.get("a"));

        }
        // if not a and b
        //put value of b to a
        else if(!(map.containsKey("a")&& map.get("a")!=null)&&( map.containsKey("b") && map.get("b") != null)){
            map.put("a", map.get("b"));
        }

    }
}

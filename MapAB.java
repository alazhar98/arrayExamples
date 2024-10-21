import java.util.HashMap;
import java.util.Map;

public class MapAB {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("b", "There");
        modifyMap(map);
        System.out.println(map);
    }
    /*
    check if map contain key a and b if it is then ,
    initialize valueA to value A and  initialize valueB to value B
    then add them to get ab
     */
    public static void modifyMap(Map<String, String> map){
        if(map.containsKey("a")&&map.containsKey("b")){
            String valueA = map.get("a");
            String valueB = map.get("b");

            map.put("ab",valueA+valueB);
        }
    }

}

package coding_bat.gera.map1;

import java.util.Map;

public class Topping2 {
    public Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("spinach")){
            map.put("spinach", "nuts");
        }
        if (map.containsKey("ice cream")){
            map.put("yogurt", map.get("ice cream"));
            map.put("ice cream", map.get("ice cream"));
        }
        return map;
    }

}

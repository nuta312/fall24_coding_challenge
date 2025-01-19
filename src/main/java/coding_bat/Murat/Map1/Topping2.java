package coding_bat.Murat.Map1;

import java.util.Map;

public class Topping2 {
    public Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream") && !map.get("ice cream").isEmpty()) {
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.containsKey("spinach") && !map.get("spinach").isEmpty()) {
            map.replace("spinach", "nuts");
        }
        return map;
    }
}
package coding_bat.Murat.Map1;

import java.util.Map;

public class Topping3 {
    public Map<String, String> topping3(Map<String, String> map) {
        if (map.containsKey("potato") && !map.get("potato").isEmpty()) {
            map.put("fries", map.get("potato"));
        }
        if (map.containsKey("salad") && !map.get("salad").isEmpty()) {
            map.put("spinach", map.get("salad"));
        }
        return map;
    }
}

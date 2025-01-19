package coding_bat.Murat.Map1;

import java.util.Map;

public class MapAB3 {
    public Map<String, String> mapAB3(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") &&
                map.get("a").isEmpty()) {
            map.replace("a", map.get("b"));
        }
        if (map.containsKey("a") && map.containsKey("b") &&
                map.get("b").isEmpty()) {
            map.replace("b", map.get("a"));
        }
        if (map.containsKey("a") && !map.containsKey("b")) {
            map.put("b", map.get("a"));
        }
        if (!map.containsKey("a") && map.containsKey("b")) {
            map.put("a", map.get("b"));
        }
        return map;
    }
}

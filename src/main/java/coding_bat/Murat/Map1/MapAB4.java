package coding_bat.Murat.Map1;

import java.util.Map;

public class MapAB4 {
    public Map<String, String> mapAB4(Map<String, String> map) {
        if (!map.containsKey("a")) return map;
        if (!map.containsKey("b")) return map;
        if (map.get("a").length() == map.get("b").length()) {
            map.replace("a", "");
            map.replace("b", "");
        }
        if (map.get("a").length() > map.get("b").length()) {
            map.put("c", map.get("a"));
        }
        if (map.get("b").length() > map.get("a").length()) {
            map.put("c", map.get("b"));
        }
        if (map.get("a").length() > map.get("b").length() && map.containsKey("c")) {
            map.replace("c", map.get("a"));
        }
        if (map.get("b").length() > map.get("a").length() && map.containsKey("c")) {
            map.replace("c", map.get("b"));
        }
        return map;
    }
}

package coding_bat.Murat.Map1;

import java.util.Map;

public class MapShare {
    public Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a") && !map.get("a").isEmpty() && map.containsKey("b")) {
            map.replace("b", map.get("a"));
        }
        if (map.containsKey("a") && !map.get("a").isEmpty() && !map.containsKey("b")) {
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }
}
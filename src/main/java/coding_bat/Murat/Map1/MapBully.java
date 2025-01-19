package coding_bat.Murat.Map1;

import java.util.Map;

public class MapBully {
    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            if (map.get("a") != "") {
                map.put("b", map.get("a"));
                map.put("a", "");
            }
        }
        return map;
    }
}
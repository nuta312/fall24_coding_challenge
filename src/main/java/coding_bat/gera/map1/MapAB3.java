package coding_bat.gera.map1;

import java.util.Map;

public class MapAB3 {
    public Map<String, String> mapAB3(Map<String, String> map) {
    if (map.containsKey("a") && !(map.containsKey("b"))){
        map.put("a", map.get("a"));
        map.put("b", map.get("a"));
    }
    if (map.containsKey("b") && !(map.containsKey("a"))){
        map.put("b", map.get("b"));
        map.put("a", map.get("b"));
    }
    return map;
}
}

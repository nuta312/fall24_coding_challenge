package coding_bat.aiperiishenbekkyzy.functional_1_2;

import java.util.Map;

public class mapBully {
    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            String tmp = map.get("a");
            map.put("a", "");
            map.put("b", tmp);
        }
        return map;
    }
}

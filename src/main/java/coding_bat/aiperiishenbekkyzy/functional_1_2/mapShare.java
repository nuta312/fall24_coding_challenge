package coding_bat.aiperiishenbekkyzy.functional_1_2;

import java.util.Map;

public class mapShare {
    public Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            String tmp = map.get("a");
            map.put("b", tmp);
        }
        map.remove("c");
        return map;
    }
}

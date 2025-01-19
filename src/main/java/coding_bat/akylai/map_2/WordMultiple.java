package coding_bat.akylai.map_2;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String key : strings) {
            if (!map.containsKey(key)) {
                map.put(key, false);
            } else {
                map.put(key, true);
            }
        }
        return map;
    }

}

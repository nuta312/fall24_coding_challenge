package coding_bat.akylai.map_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstSwap {
    public String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        Set<String> swapped = new HashSet<>();
        for (int i = 0; i < strings.length; i++) {
            String firstChar = strings[i].substring(0, 1);

            if (swapped.contains(firstChar)) {
                continue;
            }
            if (map.containsKey(firstChar)) {
                int prevIndex = map.get(firstChar);
                String temp = strings[prevIndex];
                strings[prevIndex] = strings[i];
                strings[i] = temp;

                swapped.add(firstChar);
            } else {
                map.put(firstChar, i);
            }
        }
        return strings;
    }
}

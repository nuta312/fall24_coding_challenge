package coding_bat.gulasal.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class NoLong {
    public List<String> noLong(List<String> strings) {
        // strings.removeIf(str -> str.length() >= 4);
        // return strings;

        return strings.stream()
                .filter(str -> str.length() < 4)
                .collect(Collectors.toList());
    }
}

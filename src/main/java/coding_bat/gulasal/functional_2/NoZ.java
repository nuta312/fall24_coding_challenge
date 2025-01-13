package coding_bat.gulasal.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class NoZ {
    public List<String> noZ(List<String> strings) {
        // strings.removeIf(str -> str.contains("z"));
        // return strings;

        return strings.stream()
                .filter(str -> !str.contains("z"))
                .collect(Collectors.toList());
    }

}

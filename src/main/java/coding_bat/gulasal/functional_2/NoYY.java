package coding_bat.gulasal.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class NoYY {
    public List<String> noYY(List<String> strings) {
        // strings.replaceAll(str -> str+"y");
        // strings.removeIf(str -> str.contains("yy"));
        // return strings;

        return strings.stream()
                .map(str -> str + "y")
                .filter(str -> !str.contains("yy"))
                .collect(Collectors.toList());
    }
}

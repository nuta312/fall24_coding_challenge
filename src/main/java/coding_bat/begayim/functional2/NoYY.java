package coding_bat.begayim.functional2;

import java.util.List;
import java.util.stream.Collectors;

public class NoYY {
    public List<String> noYY(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.endsWith("y"))
                .map(s -> s + "y")
                .filter(s -> !s.contains("yy"))
                .collect(Collectors.toList());
    }
}

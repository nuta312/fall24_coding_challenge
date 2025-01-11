package coding_bat.rano.function2;

import java.util.List;
import java.util.stream.Collectors;

public class NoYY {
    public List<String> noYY(List<String> strings) {
        strings.replaceAll(n -> n + "y");
        strings.removeIf(n ->n.contains("yy") );
        return strings;
    }
    public List<String> noYY1(List<String> strings) {
        return strings.stream()
                .map(n -> n + "y")
                .filter(n -> !n.contains("yy"))
                .collect(Collectors.toList());
    }
}

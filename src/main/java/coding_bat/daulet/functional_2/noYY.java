package coding_bat.daulet.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class noYY {
    public List<String> noYY(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.endsWith("y"))
                .map(s -> s + "y")
                .filter(s -> !s.contains("yy"))
                .collect(Collectors.toList());
    }
}

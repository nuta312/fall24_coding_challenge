package coding_bat.Maksim.Functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class noYY {
    public List<String> noYY(List<String> strings) {
        return strings.stream()
                .map(s -> s + "y")
                .filter(s -> !s.contains("yy"))
                .collect(Collectors.toList());
    }
}

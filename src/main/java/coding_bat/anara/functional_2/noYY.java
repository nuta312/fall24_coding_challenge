package coding_bat.anara.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class noYY {
    public List<String> noYY(List<String> strings) {
        return strings.stream()
                .map(n -> n + "y")
                .filter(n -> !n.contains("yy"))
                .collect(Collectors.toList());
    }

}

package coding_bat.mirat.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class NoX {
    public List<String> noX(List<String> strings) {
        return strings.stream()
                .map(n -> n.replace("x", ""))
                .collect(Collectors.toList());
    }

}

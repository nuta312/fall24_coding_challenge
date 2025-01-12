package coding_bat.anara.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class noX {
    public List<String> noX(List<String> strings) {
        return strings.stream()
                .map(n -> n.replaceAll("x", ""))
                .collect (Collectors.toList());

    }
}

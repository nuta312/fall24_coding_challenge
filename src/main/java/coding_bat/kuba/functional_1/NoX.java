package coding_bat.kuba.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class NoX {
    public List<String> noX(List<String> strings) {
        return strings.stream()
                .map (str -> str.replace("x",""))
                .collect(Collectors.toList());
    }
}

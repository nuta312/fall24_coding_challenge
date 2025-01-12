package coding_bat.daulet.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class noZ {
    public List<String> noZ(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.contains("z"))
                .collect(Collectors.toList());
    }
}

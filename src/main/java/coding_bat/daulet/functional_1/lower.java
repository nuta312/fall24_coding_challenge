package coding_bat.daulet.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class lower {
    public List<String> lower(List<String> strings) {
        return strings.stream()
                .map(s -> s.toLowerCase())
                .collect(Collectors.toList());
    }

}

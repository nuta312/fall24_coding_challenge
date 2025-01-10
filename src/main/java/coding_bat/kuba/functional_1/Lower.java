package coding_bat.kuba.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class Lower {
    public List<String> lower(List<String> strings) {
        return strings.stream()
                .map (str -> str.toLowerCase())
                .collect(Collectors.toList());
    }
}

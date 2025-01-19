package coding_bat.Maksim.Functional1;

import java.util.List;
import java.util.stream.Collectors;

public class lower {
    public List<String> lower(List<String> strings) {
        return strings.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }
}

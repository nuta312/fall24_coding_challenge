package coding_bat.Maksim.Functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class noLong {
    public List<String> noLong(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() < 4)
                .collect(Collectors.toList());
    }
}

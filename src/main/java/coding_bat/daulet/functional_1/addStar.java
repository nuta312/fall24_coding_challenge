package coding_bat.daulet.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class addStar {
    public List<String> addStar(List<String> strings) {
        return strings.stream()
                .map(s -> s + "*")
                .collect(Collectors.toList());
    }
}

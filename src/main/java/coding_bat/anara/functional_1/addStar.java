package coding_bat.anara.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class addStar {
    public List<String> addStar(List<String> strings) {
        return strings.stream()
                .map(n -> n + "*")
                .collect (Collectors.toList());

    }
}

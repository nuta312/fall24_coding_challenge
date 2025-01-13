package coding_bat.anara.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class moreY {
    public List<String> moreY(List<String> strings) {
        return strings.stream()
                .map(n -> "y" + n + "y")
                .collect (Collectors.toList());

    }
}

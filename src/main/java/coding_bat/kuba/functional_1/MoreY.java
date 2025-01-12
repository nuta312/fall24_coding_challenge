package coding_bat.kuba.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class MoreY {
    public List<String> moreY(List<String> strings) {
        return strings.stream()
                .map (str -> "y" + str + "y")
                .collect (Collectors.toList());
    }
}

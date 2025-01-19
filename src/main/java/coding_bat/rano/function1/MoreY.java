package coding_bat.rano.function1;

import java.util.List;
import java.util.stream.Collectors;

public class MoreY {
    public List<String> moreY(List<String> strings) {
        strings.replaceAll(n -> "y" + n + "y");
        return strings;
    }
    public List<String> moreY1(List<String> strings) {
        return strings.stream()
                .map(n -> "y" + n + "y")
                .collect(Collectors.toList());
    }
}

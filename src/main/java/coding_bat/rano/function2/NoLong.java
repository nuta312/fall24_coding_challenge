package coding_bat.rano.function2;

import java.util.List;
import java.util.stream.Collectors;

public class NoLong {
    public List<String> noLong(List<String> strings) {
        strings.removeIf(n -> n.length() >= 4);
        return strings;
    }
    public List<String> noLong1(List<String> strings) {
        return strings.stream()
                .filter(n -> n.length() < 4)
                .collect(Collectors.toList());
    }
}

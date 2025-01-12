package coding_bat.rano.function2;

import java.util.List;
import java.util.stream.Collectors;

public class NoZ {
    public List<String> noZ(List<String> strings) {
        strings.removeIf(n -> n.contains("z"));
        return strings;
    }
    public List<String> noZ1(List<String> strings) {
        return strings.stream()
                .filter(n -> !n.contains("z"))
                .collect(Collectors.toList());

    }
}

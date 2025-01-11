package coding_bat.rano.function1;

import java.util.List;
import java.util.stream.Collectors;

public class NoX {
    public List<String> noX(List<String> strings) {
        strings.replaceAll(n -> n.replace("x", ""));
        return strings;
    }
    public List<String> noX1(List<String> strings1) {
        return strings1.stream()
                .map(n -> n.replace("x", ""))
                .collect(Collectors.toList());
    }
}

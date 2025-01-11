package coding_bat.rano.function1;

import java.util.List;
import java.util.stream.Collectors;

public class Lower {
    public List<String> lower(List<String> strings) {
        strings.replaceAll(n -> n.toLowerCase());
        return strings;
    }
    public List<String> lower1(List<String> strings1) {
        return strings1.stream()
                .map(n -> n.toLowerCase())
                .collect(Collectors.toList());
    }
}

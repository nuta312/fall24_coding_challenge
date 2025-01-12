package coding_bat.rano.function2;

import java.util.List;
import java.util.stream.Collectors;

public class No34 {
    public List<String> no34(List<String> strings) {
        strings.removeIf(n -> n.length() == 3 || n.length() == 4);
        return strings;
    }
    public List<String> no341(List<String> strings) {
        return strings.stream()
                .filter(n -> n.length() != 3 && n.length() != 4)
                .collect(Collectors.toList());
    }
}

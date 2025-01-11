package coding_bat.rano.function1;

import java.util.List;
import java.util.stream.Collectors;

public class AddStar {
    public List<String> addStar(List<String> strings) {
        strings.replaceAll(n -> n + "*");
        return strings;
    }
    public List<String> addStar1(List<String> strings) {
        return strings.stream()
                .map(x -> x + "*")
                .collect(Collectors.toList());
    }
}

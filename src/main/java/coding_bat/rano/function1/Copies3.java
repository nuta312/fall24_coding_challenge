package coding_bat.rano.function1;

import java.util.List;
import java.util.stream.Collectors;

public class Copies3 {
    public List<String> copies3(List<String> strings) {
        strings.replaceAll(n -> n + n + n);
        return strings;
    }
    public List<String> copies31(List<String> strings) {
        return strings.stream()
                .map(n -> n + n + n)
                .collect(Collectors.toList());
    }
}

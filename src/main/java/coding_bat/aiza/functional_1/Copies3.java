package coding_bat.aiza.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class Copies3 {
    public List<String> copies3(List<String> strings) {
        return strings.stream()
                .map(s -> s + s +s)
                .collect(Collectors.toList());
    }
}

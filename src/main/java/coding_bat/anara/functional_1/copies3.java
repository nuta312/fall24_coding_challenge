package coding_bat.anara.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class copies3 {
    public List<String> copies3(List<String> strings) {
        return strings.stream()
                .map(n -> n + n + n)
                .collect (Collectors.toList());
    }
}

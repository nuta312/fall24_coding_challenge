package coding_bat.daulet.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class copies3 {
    public List<String> copies3(List<String> strings) {
        return strings.stream()
                .map(copies3 -> copies3 + copies3 + copies3)
                .collect(Collectors.toList());
    }
}

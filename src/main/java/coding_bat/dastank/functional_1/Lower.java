package coding_bat.dastank.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class Lower {
    public List<String> lower(List<String> strings) {
        return strings.stream().map(String::toLowerCase).toList();
    }
}

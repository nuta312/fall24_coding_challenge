package coding_bat.dastanA.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class Lower {
    public List<String> lower1(List<String> strings) {
        List<String> lower = strings.stream()
                .map(n -> n.toLowerCase())
                .collect(Collectors.toList());
        return strings;
    }

    public List<String> lower2(List<String> strings) {
        strings.replaceAll(n -> n.toLowerCase());
        return strings;
    }

}

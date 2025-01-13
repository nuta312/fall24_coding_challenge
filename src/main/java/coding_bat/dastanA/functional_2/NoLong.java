package coding_bat.dastanA.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class NoLong {
    public List<String> noLong1(List<String> strings) {
        List<String> lengthLess4 = strings.stream()
                .filter(n -> n.length() < 4)
                .collect(Collectors.toList());
        return lengthLess4;
    }

    public List<String> noLong2(List<String> strings) {
        strings.removeIf(n -> n.length() >= 4);
        return strings;
    }
}

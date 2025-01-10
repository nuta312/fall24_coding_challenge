package coding_bat.dastanA.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class NoZ {
    public List<String> noZ1(List<String> strings) {
        List<String> withoutZ = strings.stream()
                .filter(n -> !n.contains("z"))
                .collect(Collectors.toList());

        return withoutZ;
    }

    public List<String> noZ2(List<String> strings) {
        strings.removeIf(n -> n.contains("z"));
        return strings;
    }

}

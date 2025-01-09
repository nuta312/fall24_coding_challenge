package coding_bat.dastanA.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class Copies3 {
    public List<String> copies3(List<String> strings) {
        List<String> threeCopies = strings.stream()
                .map(n -> n + n + n)
                .collect(Collectors.toList());
        return strings;
    }

    public List<String> copies33(List<String> strings) {
        strings.replaceAll(n -> n + n + n);
        return strings;
    }

}

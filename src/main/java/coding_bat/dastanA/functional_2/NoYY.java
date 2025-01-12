package coding_bat.dastanA.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class NoYY {
    public List<String> noYY1(List<String> strings) {
        List<String> withoutYY = strings.stream()
                .map(n -> n.concat("y"))
                .filter(n -> !n.contains("yy"))
                .collect(Collectors.toList());
        return withoutYY;
    }

    public List<String> noYY2(List<String> str) {
        str.replaceAll(n -> n.concat("y"));
        str.removeIf(n -> n.contains("yy"));
        return str;
    }

}

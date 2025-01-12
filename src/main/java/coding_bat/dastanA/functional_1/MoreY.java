package coding_bat.dastanA.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class MoreY {
    public List<String> moreY1(List<String> strings) {
        List<String> addY = strings.stream()
                            .map(n -> "y" + n + "y")
                            .collect(Collectors.toList());
        return addY;

    }
    public List<String> moreY2(List<String> strings) {
        strings.replaceAll(n -> "y" + n + "y");
        return strings;
    }

}

package coding_bat.dastank.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class MoreY {
    public List<String> moreY(List<String> strings) {
        return strings.stream().map(n->"y"+n+"y").toList();
    }
}

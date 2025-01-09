package coding_bat.nasyikat.functional_1;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MoreY2 {
    public List<String> moreY(List<String> strings) {
        return strings.stream()
                .map(string -> "y" + string + "y")
                .collect(Collectors.toList());
    }
}

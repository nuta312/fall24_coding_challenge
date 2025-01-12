package coding_bat.akylai.stream_functional1;

import java.util.List;
import java.util.stream.Collectors;

public class MoreY_1 {
    public List<String> moreY(List<String> strings) {
        return strings.stream().map(n -> "y" + n + "y").collect(Collectors.toList());
    }
}

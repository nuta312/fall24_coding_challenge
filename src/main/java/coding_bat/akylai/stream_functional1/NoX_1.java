package coding_bat.akylai.stream_functional1;

import java.util.List;
import java.util.stream.Collectors;

public class NoX_1 {
    public List<String> noX(List<String> strings) {
        return strings.stream().map(n -> n.replace("x", "")).collect(Collectors.toList());
    }
}

package coding_bat.akylai.stream_functional1;

import java.util.List;
import java.util.stream.Collectors;

public class Copies3_1 {
    public List<String> copies3(List<String> strings) {
        return strings.stream().map(n -> n + n + n).collect(Collectors.toList());
    }
}

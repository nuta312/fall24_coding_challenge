package coding_bat.akylai.stream_functional1;

import java.util.List;
import java.util.stream.Collectors;

public class Lower_1 {
    public List<String> lower(List<String> strings) {
        return strings.stream().map(String::toLowerCase).collect(Collectors.toList());
    }
}

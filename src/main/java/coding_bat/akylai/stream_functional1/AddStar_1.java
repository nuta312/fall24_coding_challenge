package coding_bat.akylai.stream_functional1;

import java.util.List;
import java.util.stream.Collectors;

public class AddStar_1 {
    public List<String> addStar(List<String> strings) {
        return strings.stream().map(n -> n + '*').collect(Collectors.toList());
    }
}

package coding_bat.aiperiishenbekkyzy.functional_1_2;

import java.util.List;
import java.util.stream.Collectors;

public class noX {
    public List<String> noX(List<String> strings) {
        return strings.stream()
                .map(x -> x.replaceAll("x", ""))
                .collect(Collectors.toList());
    }
}

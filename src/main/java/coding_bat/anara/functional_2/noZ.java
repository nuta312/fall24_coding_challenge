package coding_bat.anara.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class noZ {
    public List<String> noZ(List<String> strings) {
        return strings.stream()
                .filter(n -> ! n.contains("z"))
                .collect(Collectors.toList());
    }
}

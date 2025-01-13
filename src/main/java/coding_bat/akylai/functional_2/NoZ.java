package coding_bat.akylai.functional_2;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class NoZ {
    public List<String> noZ(List<String> strings) {
        return strings.stream().filter(str -> !str.toLowerCase().contains("z"))
                .collect(Collectors.toList());
    }
}

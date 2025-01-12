package coding_bat.anara.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class no34 {
    public List<String> no34(List<String> strings) {
        return strings.stream()
                .filter(n ->  n.length() < 3 || n.length() > 4)
                .collect(Collectors.toList());

    }
}

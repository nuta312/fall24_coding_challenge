package coding_bat.daulet.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class no34 {
    public List<String> no34(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() != 3)
                .filter(s -> s.length()!= 4)
                .collect(Collectors.toList());
    }
}

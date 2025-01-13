package coding_bat.begayim.functional2;

import java.util.List;
import java.util.stream.Collectors;

public class No34 {
    public List<String> no34(List<String> strings) {
        return strings.stream().filter(s -> s.length() != 4 && s.length() != 3).collect(Collectors.toList());
    }
}

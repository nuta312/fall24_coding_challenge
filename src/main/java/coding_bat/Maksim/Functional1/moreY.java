package coding_bat.Maksim.Functional1;

import java.util.List;
import java.util.stream.Collectors;

public class moreY {

    public List<String> moreY(List<String> strings) {
        return strings.stream()
                .map(s -> "y" + s + "y")
                .collect(Collectors.toList());
    }
}

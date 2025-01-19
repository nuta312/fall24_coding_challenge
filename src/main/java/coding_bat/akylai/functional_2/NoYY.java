package coding_bat.akylai.functional_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NoYY {
    public List<String> noYY(List<String> strings) {
        return strings.stream().map(str -> str + "y").
                filter(str -> !str.contains("yy")).collect(Collectors.toList());
    }
}

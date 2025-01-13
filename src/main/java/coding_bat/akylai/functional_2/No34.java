package coding_bat.akylai.functional_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class No34 {
    public List<String> no34(List<String> strings) {
        return strings.stream().filter(str -> str.length() < 3 || str.length() > 4)
                .collect(Collectors.toList());
    }
}

package coding_bat.gulasal.functional_1;

import java.util.List;

public class NoX {
    public List<String> noX(List<String> strings) {
// return strings.stream()
// .map(str -> str.replace("x", ""))
// .collect(Collectors.toList());

        strings.replaceAll(str -> str.replace("x", ""));
        return strings;
    }
}

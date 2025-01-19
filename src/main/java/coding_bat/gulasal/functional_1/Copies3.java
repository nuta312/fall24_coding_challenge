package coding_bat.gulasal.functional_1;

import java.util.List;

public class Copies3 {
    public List<String> copies3(List<String> strings) {
// return strings.stream()
// .map(str -> str + str + str)
// .collect(Collectors.toList());
        strings.replaceAll(str -> str + str + str);
        return strings;
    }
}

package coding_bat.gulasal.functional_1;

import java.util.List;

public class AddStar {
    public List<String> addStar(List<String> strings) {

// return strings.stream()
// .map(str -> str + "*")
// .collect(Collectors.toList());

        strings.replaceAll(str -> str + "*");
        return strings;
    }
}

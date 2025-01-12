package coding_bat.gulasal.functional_1;

import java.util.List;

public class MoreY {
    public List<String> moreY(List<String> strings) {
        // return strings.stream()
        // .map(str -> "y" + str + "y")
        // .collect(Collectors.toList());

        strings.replaceAll(str -> "y" + str + "y");
        return strings;
    }
}

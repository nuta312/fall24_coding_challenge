package coding_bat.gulasal.functional_1;

import java.util.List;

public class Lower {
    public List<String> lower(List<String> strings) {
// return strings.stream()
// .map(str -> str.toLowerCase())
// .collect(Collectors.toList());

        strings.replaceAll(String::toLowerCase);
        return strings;
    }

}

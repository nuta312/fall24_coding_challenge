package coding_bat.aiperiishenbekkyzy.functional_1;

import java.util.List;

public class lower {
    public List<String> lower(List<String> strings) {
        strings.replaceAll(n -> n.toLowerCase());
        return strings;
    }
}

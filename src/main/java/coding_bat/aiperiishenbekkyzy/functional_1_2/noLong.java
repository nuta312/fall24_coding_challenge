package coding_bat.aiperiishenbekkyzy.functional_1_2;

import java.util.List;

public class noLong {
    public List<String> noLong(List<String> strings) {
        strings.removeIf(n -> n.length() >= 4);
        return strings;
    }
}

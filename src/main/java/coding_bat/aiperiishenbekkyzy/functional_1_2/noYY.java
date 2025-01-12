package coding_bat.aiperiishenbekkyzy.functional_1_2;

import java.util.List;

public class noYY {
    public List<String> noYY(List<String> strings) {
        strings.replaceAll(n -> n + "y");
        strings.removeIf(n -> n.contains("yy"));
        return strings;
    }
}

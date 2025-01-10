package coding_bat.aiperiishenbekkyzy.functional_1_2;

import java.util.List;

public class addStar {
    public List<String> addStar(List<String> strings) {
        strings.replaceAll(n -> n + "*");
        return strings;
    }
}

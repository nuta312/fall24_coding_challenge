package coding_bat.aiperiishenbekkyzy.functional_1_2;

import java.util.List;

public class copies3 {
    public List<String> copies3(List<String> strings) {
        strings.replaceAll(n -> n + n + n);
        return strings;
    }
}

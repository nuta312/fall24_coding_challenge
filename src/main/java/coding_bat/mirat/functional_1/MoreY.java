package coding_bat.mirat.functional_1;

import java.util.List;

public class MoreY {
    public List<String> moreY(List<String> strings) {
        strings.replaceAll(n -> "y"+n+"y");
        return strings;
    }

}

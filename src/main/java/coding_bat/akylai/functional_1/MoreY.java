package coding_bat.akylai.functional_1;

import java.util.List;

public class MoreY {
    public List<String> moreY(List<String> strings) {
        for (int i = 0; i < strings.size(); i++){
            strings.set(i, "y" + strings.get(i) + "y");
        }
        return strings;
    }
}

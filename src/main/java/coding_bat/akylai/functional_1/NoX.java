package coding_bat.akylai.functional_1;

import java.util.ArrayList;
import java.util.List;

public class NoX {
    public List<String> noX(List<String> strings) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            list.add(strings.get(i).replace("x", ""));
        }
        return list;
    }
}

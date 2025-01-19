package coding_bat.nasyikat.functional_1;

import java.util.ArrayList;
import java.util.List;

public class MoreY1 {
    public List<String> moreY(List<String> strings) {
        List<String> list = new ArrayList<>();
        for (String string : strings) {
            list.add("y" + string + "y");
        }
        return list;
    }
}

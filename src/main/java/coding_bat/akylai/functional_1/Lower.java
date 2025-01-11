package coding_bat.akylai.functional_1;

import java.util.ArrayList;
import java.util.List;

public class Lower {
    public List<String> lower(List<String> strings) {
        List<String> list = new ArrayList<>();
        for (String word : strings){
            list.add(word.toLowerCase());
        }
        return list;
    }
}

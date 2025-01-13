package coding_bat.nasyikat.functional_1;

import java.util.ArrayList;
import java.util.List;

public class AddStar1 {
    public List<String> addStar(List<String> strings) {
        List<String> list = new ArrayList<>();
        for (String string : strings){
            list.add(string.concat("*"));
        }
        return list;
    }
}

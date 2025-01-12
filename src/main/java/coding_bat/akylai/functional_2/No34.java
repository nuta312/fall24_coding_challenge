package coding_bat.akylai.functional_2;

import java.util.ArrayList;
import java.util.List;

public class No34 {
    public List<String> no34(List<String> strings) {
        List<String> list = new ArrayList<>();
        for (String word : strings){
            if (word.length() < 3 || word.length() > 4){
                list.add(word);
            }
        }
        return list;
    }
}

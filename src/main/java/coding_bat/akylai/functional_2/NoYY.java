package coding_bat.akylai.functional_2;

import java.util.ArrayList;
import java.util.List;

public class NoYY {
    public List<String> noYY(List<String> strings) {
        List<String> list = new ArrayList<>();
        for (String word : strings){
            String newWord = word + "y";
            if (!newWord.contains("yy")){
                list.add(newWord);
            }
        }
        return list;
    }
}

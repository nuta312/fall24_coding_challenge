package coding_bat.akylai.functional_2;

import java.util.Iterator;
import java.util.List;

public class NoZ {
    public List<String> noZ(List<String> strings) {
        Iterator<String> list = strings.iterator();
        while(list.hasNext()){
            if (list.next().contains("z")){
                list.remove();
            }
        }
        return strings;
    }
}

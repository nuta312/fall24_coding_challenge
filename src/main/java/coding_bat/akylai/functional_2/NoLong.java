package coding_bat.akylai.functional_2;

import java.util.Iterator;
import java.util.List;

public class NoLong {
    public List<String> noLong(List<String> strings) {
        Iterator<String> list = strings.iterator();
        while(list.hasNext()){
            if (list.next().length() >= 4){
                list.remove();
            }
        }
        return strings;
    }
}

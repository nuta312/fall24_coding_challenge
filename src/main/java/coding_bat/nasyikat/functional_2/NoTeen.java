package coding_bat.nasyikat.functional_2;

import java.util.ArrayList;
import java.util.List;

public class NoTeen {
    public List<Integer> noTeen(List<Integer> nums) {
        List<Integer> list = new ArrayList<>();
        for (Integer num : nums) {
            if (!(num >=13 && num <=19)) {
                list.add(num);
            }
        }
        return list;
    }
}

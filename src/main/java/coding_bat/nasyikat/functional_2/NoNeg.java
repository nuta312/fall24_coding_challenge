package coding_bat.nasyikat.functional_2;

import java.util.ArrayList;
import java.util.List;

public class NoNeg {
    public List<Integer> noNeg(List<Integer> nums) {
        List<Integer> list = new ArrayList<>();
        for (Integer num : nums) {
            if (num >= 0) {
                list.add(num);
            }
        }
        return list;
    }
}

package coding_bat.nasyikat.functional_2;

import java.util.ArrayList;
import java.util.List;

public class No9 {
    public List<Integer> no9(List<Integer> nums) {
        List<Integer> list = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 10 != 9) {
                list.add(num);
            }
        }
        return list;
    }
}

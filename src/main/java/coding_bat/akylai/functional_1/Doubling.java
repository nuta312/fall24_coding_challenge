package coding_bat.akylai.functional_1;

import java.util.ArrayList;
import java.util.List;

public class Doubling {
    public List<Integer> doubling(List<Integer> nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.size(); i ++){
            list.add(nums.get(i) * 2);
        }
        return list;
    }
}

package coding_bat.akylai.functional_2;

import java.util.ArrayList;
import java.util.List;

public class NoNeg {
    public List<Integer> noNeg(List<Integer> nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++){
            if (nums.get(i) >= 0){
                list.add(nums.get(i));
            }
        }
        return list;
    }
}

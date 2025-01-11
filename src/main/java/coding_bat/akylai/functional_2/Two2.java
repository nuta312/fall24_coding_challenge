package coding_bat.akylai.functional_2;

import java.util.ArrayList;
import java.util.List;

public class Two2 {
    public List<Integer> two2(List<Integer> nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums){
            if ((num *2) % 10 != 2){
                list.add(num * 2);
            }
        }
        return list;
    }
}

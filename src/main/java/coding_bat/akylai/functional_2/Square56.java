package coding_bat.akylai.functional_2;

import java.util.ArrayList;
import java.util.List;

public class Square56 {
    public List<Integer> square56(List<Integer> nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums){
            if ((num * num + 10) % 10 != 5 && (num * num + 10) % 10 != 6){
                list.add(num * num + 10);
            }
        }
        return list;
    }
}

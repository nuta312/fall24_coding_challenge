package coding_bat.anara.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class noTeen {
    public List<Integer> noTeen(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n < 13 || n > 19)
                .collect(Collectors.toList());
    }

}

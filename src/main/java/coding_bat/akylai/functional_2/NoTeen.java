package coding_bat.akylai.functional_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {
    public List<Integer> noTeen(List<Integer> nums) {
        return nums.stream().filter(n -> n < 13 || n > 19).collect(Collectors.toList());
    }
}

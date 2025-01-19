package coding_bat.mirat.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {
    public List<Integer> noTeen(List<Integer> nums) {
    return nums.stream()
            .filter(n -> (13 > n) || (n > 19))
            .collect(Collectors.toList());
}

}

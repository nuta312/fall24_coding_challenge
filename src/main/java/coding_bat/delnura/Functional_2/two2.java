package coding_bat.delnura.Functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class two2 {
    public List<Integer> two2(List<Integer> nums) {
        return nums.stream()
                .map(s -> s * 2 )
                .filter(n -> n % 10 != 2)
                .collect(Collectors.toList());
    }
}

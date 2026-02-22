package coding_bat.delnura.Functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class no9 {
    public List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n % 10 != 9)
                .collect(Collectors.toList());
    }

}

package coding_bat.gulasal.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class Two2 {
    public List<Integer> two2(List<Integer> nums) {
        // nums.replaceAll(n -> n*2);
        // nums.removeIf(n -> n%10==2);
        // return nums;

        return nums.stream()
                .map(n -> n * 2)
                .filter(n -> n%10 != 2)
                .collect(Collectors.toList());
    }
}

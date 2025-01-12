package coding_bat.gulasal.functional_1;

import java.util.List;

public class Doubling {
    public List<Integer> doubling(List<Integer> nums) {

        // return nums.stream()
        // .map (n -> n * 2)
        // .collect(Collectors.toList());
        nums.replaceAll(n -> n * 2);
        return nums;
    }
}

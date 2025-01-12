package coding_bat.gulasal.functional_1;

import java.util.List;

public class Math1 {
    public List<Integer> math1(List<Integer> nums) {
        // return nums.stream()
        // .map(n -> (n + 1) * 10)
        // .collect(Collectors.toList());

        nums.replaceAll(n -> (n + 1) * 10);
        return nums;
    }

}

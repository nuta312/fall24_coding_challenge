package coding_bat.gulasal.functional_1;

import java.util.List;

public class Square {
    public List<Integer> square(List<Integer> nums) {

        // return nums.stream()
        // .map (n -> n * n)
        // .collect(Collectors.toList());

        nums.replaceAll(n -> n * n);
        return nums;
    }

}

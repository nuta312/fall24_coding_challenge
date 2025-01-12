package coding_bat.gulasal.functional_1;

import java.util.List;

public class RightDigit {
    public List<Integer> rightDigit(List<Integer> nums) {
// return nums.stream()
// .map(n -> n%10)
// .collect(Collectors.toList());

        nums.replaceAll(n -> n%10);
        return nums;
    }
}

package coding_bat.dastank.functional_2;

import java.util.List;

public class No9 {
    public List<Integer> no9(List<Integer> nums) {
        nums.removeIf(num -> num%10==9);
        return nums;
    }
}

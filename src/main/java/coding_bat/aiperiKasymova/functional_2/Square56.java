package coding_bat.aiperiKasymova.functional_2;

import java.util.List;

public class Square56 {
    public List<Integer> square56(List<Integer> nums) {
        nums.replaceAll(n -> ((int) Math.pow(n , 2)) + 10);
        nums.removeIf(n -> n % 10 == 5 || n % 10 == 6);
        return nums;
    }
}

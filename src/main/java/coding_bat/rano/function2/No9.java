package coding_bat.rano.function2;

import java.util.List;
import java.util.stream.Collectors;

public class No9 {
    public List<Integer> no9(List<Integer> nums) {
        nums.removeIf(n -> (n % 10) == 9);
        return nums;
    }
    public List<Integer> no91(List<Integer> nums1){
        List<Integer> result = nums1.stream()
                .filter(n -> (n % 10) != 9)
                .collect(Collectors.toList());
                return result;
    }
}

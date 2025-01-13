package coding_bat.rano.function1;

import java.util.List;
import java.util.stream.Collectors;

public class Doubling {

    public List<Integer> doubling1(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }
    public List<Integer> doubling(List<Integer> nums1) {
        List<Integer> multiplyTwo = nums1.stream()
                .map(n -> n * 2)
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
        return multiplyTwo;
    }

}

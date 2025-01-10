package coding_bat.rano.function1;

import java.util.List;
import java.util.stream.Collectors;

public class Square {
    public List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n -> n * n);
        return nums;
    }
    public List<Integer> square1(List<Integer> nums1) {
        return nums1.stream()
                .map(n -> n * n)
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
    }

}

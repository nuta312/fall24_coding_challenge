package coding_bat.rano.function2;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Square56 {
    public List<Integer> square56(List<Integer> nums) {
        nums.replaceAll(n -> ((int) Math.pow(n , 2)) + 10);
        nums.removeIf(n -> n % 10 == 5 || n % 10 == 6);
        return nums;
    }
    public List<Integer> square561(List<Integer> nums1) {
        return nums1.stream()
                .map(n -> ((int) Math.pow(n , 2)) + 10)
                .filter(n -> n % 10 != 5 && n % 10 != 6)
                .collect(Collectors.toList());
    }
}

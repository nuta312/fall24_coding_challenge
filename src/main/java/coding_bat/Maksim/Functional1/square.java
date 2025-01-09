package coding_bat.Maksim.Functional1;

import java.util.List;
import java.util.stream.Collectors;


public class square {
    public static List<Integer> square(List<Integer> nums) {
    return nums.stream()
            .map(x -> x * x)
            .collect(Collectors.toList());
}
    public static List<Integer> square1(List<Integer> nums) {
    nums.replaceAll(x -> x * x);
    return nums;
}
}
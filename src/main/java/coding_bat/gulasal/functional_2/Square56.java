package coding_bat.gulasal.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class Square56 {
    public List<Integer> square56(List<Integer> nums) {
        // nums.replaceAll(n -> (n*n)+10);
        // nums.removeIf(n -> n%10==5 || n%10==6);
        // return nums;

        return nums.stream()
                .map(n -> n * n + 10)
                .filter(n -> n%10 != 5 && n%10 != 6)
                .collect(Collectors.toList());
    }

}

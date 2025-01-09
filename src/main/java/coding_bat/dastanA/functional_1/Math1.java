package coding_bat.dastanA.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class Math1 {
    public List<Integer> math1(List<Integer> nums) {
        List<Integer> math = nums.stream()
                .map(n -> (n+1) * 10)
                .collect(Collectors.toList());
        return nums;
    }

    public List<Integer> math11(List<Integer> numbers) {
        numbers.replaceAll(n -> (n+1) * 10);
        return numbers;
    }

}

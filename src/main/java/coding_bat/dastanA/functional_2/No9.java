package coding_bat.dastanA.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class No9 {
    public List<Integer> no9(List<Integer> nums) {
        return nums.stream().
                filter(n -> n % 10 != 9).
                collect(Collectors.toList());
    }

    public List<Integer> no99(List<Integer> numbers) {
        numbers.removeIf(n -> n % 10 == 9);
        return numbers;
    }

}

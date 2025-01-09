package coding_bat.dastanA.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class NoNeg {
    public List<Integer> noNeg1(List<Integer> nums) {
        List<Integer> positiveNums = nums.stream()
                                    .filter(n -> n >= 0)
                                     .collect(Collectors.toList());

        return positiveNums;
    }

    public List<Integer> noNeg2(List<Integer> numbers) {
        numbers.removeIf(n -> n < 0);
        return numbers;
    }

}

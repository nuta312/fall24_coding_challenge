package coding_bat.dastanA.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class RightDigit {
    public List<Integer> rightDigit1(List<Integer> nums) {
        List<Integer> rightDigit = nums.stream()
                .map(n -> n % 10)
                .collect(Collectors.toList());
        return rightDigit;
    }

    public List<Integer> rightDigit2(List<Integer> numbers) {
        numbers.replaceAll(n -> n % 10);
        return numbers;
    }
}

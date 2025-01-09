package coding_bat.dastanA.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class Square {
    public List<Integer> square1(List<Integer> nums) {
        List<Integer> square = nums.stream()
                                .map(n -> n * n)
                                .collect(Collectors.toList());
        return square;
    }

    public List<Integer> square2(List<Integer> numbers) {
        numbers.replaceAll(n -> n * n);
        return numbers;
    }
}

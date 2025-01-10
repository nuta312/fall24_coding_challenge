package coding_bat.dastanA.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {
    public List<Integer> noTeen1(List<Integer> nums) {
        List<Integer> removeTeen = nums.stream()
                .filter(n -> n < 13 || n > 19)
                .collect(Collectors.toList());
        return removeTeen;
    }

    public List<Integer> noTeen2(List<Integer> numbers) {
        numbers.removeIf(n -> n >= 13 && n <= 19);
        return numbers;
    }

}

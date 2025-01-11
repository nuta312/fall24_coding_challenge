package coding_bat.dastanA.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class Two2 {
    public List<Integer> two2_1(List<Integer> numbers) {
        List<Integer> result = numbers.stream()
                            .map(n -> n * 2)
                            .filter(n -> n % 10 != 2)
                            .collect(Collectors.toList());
        return numbers;
    }

    public List<Integer> two2_2(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        nums.removeIf(n -> n % 10 == 2);
        return nums;
    }

}

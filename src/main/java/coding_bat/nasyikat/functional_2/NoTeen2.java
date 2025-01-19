package coding_bat.nasyikat.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class NoTeen2 {
    public List<Integer> noTeen(List<Integer> nums) {
        return nums.stream()
                .filter(num -> !(num >=13 && num <=19))
                .collect(Collectors.toList());

    }
}

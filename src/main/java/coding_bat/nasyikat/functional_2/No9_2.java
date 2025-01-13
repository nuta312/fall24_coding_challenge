package coding_bat.nasyikat.functional_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class No9_2 {
    public List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(num -> num % 10 != 9)
                .collect(Collectors.toList());
    }
}

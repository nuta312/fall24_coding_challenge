package coding_bat.akylai.stream_functional1;

import java.util.List;
import java.util.stream.Collectors;

public class RightDigit_1 {
    public List<Integer> rightDigit(List<Integer> nums){
        return nums.stream().map(n -> n % 10).collect(Collectors.toList());
    }
}

package coding_bat.nasyikat.functional_1;

import java.util.List;

public class Square1 {
    public List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n -> n * n);
        return nums;
    }
}

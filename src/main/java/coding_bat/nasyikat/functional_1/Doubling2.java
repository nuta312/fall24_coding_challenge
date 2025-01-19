package coding_bat.nasyikat.functional_1;

import java.util.List;

public class Doubling2 {
    public class Doubling {
        public List<Integer> doubling(List<Integer> nums) {
            nums.replaceAll(n -> n * 2);
            return nums;
        }
    }
}

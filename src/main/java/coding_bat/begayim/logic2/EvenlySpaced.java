package coding_bat.begayim.logic2;

import java.util.Arrays;

public class EvenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
        int[] nums = {a, b, c};
        Arrays.sort(nums);
        return (nums[1] - nums[0]) == (nums[2] - nums[1]);
    }
}

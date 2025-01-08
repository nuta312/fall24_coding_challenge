package coding_bat.daulet.array1;

import java.util.Arrays;

public class makeMiddle {
    public int[] makeMiddle(int[] nums) {
        int v = nums.length/2;
        int [] first = Arrays.copyOfRange(nums,0,v);
        int [] sec = Arrays.copyOfRange(nums,v,nums.length);
        int[] all = {first[first.length-1],sec[0]};
        return all;
    }
}

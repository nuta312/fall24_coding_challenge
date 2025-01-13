package coding_bat.daulet.array1;

import java.util.Arrays;

public class maxTriple {
    public int maxTriple(int[] nums) {

        int c = nums[0];
        int v = nums[nums.length-1];
        int d = nums.length/2;
        int[] first = Arrays.copyOfRange(nums,0,d);
        int[] sec = Arrays.copyOfRange(nums,d,nums.length);
        int m = sec[0];
        if (c > v && c > m){
            return c;
        } else if (v > c && v > m) {
            return v;
        }else {
            return m;
        }
    }

}

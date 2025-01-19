package coding_bat.Maksim.array1;

import java.util.Arrays;

public class midThree {
    public int[] midThree(int[] nums) {

        if(nums.length == 3){
            return nums;
        }else{
            int v = nums.length/2;
            int [] first = Arrays.copyOfRange(nums,0,v);
            int [] sec = Arrays.copyOfRange(nums,v,nums.length);
            int[] all = {first[first.length-1],sec[0],sec[1]};
            return all;
        }
    }

}

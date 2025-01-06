package coding_bat.dastank.warm_up2;

public class Array667 {
    public int array667(int[] nums) {
        int a = 0;
        for(int b=0;b<nums.length-1;b++){
            if(nums[b]==6 && (nums[b+1]==6 || nums[b+1]==7)){
                a++;
            }
        }return a;
    }

}

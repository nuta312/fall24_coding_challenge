package coding_bat.kuba.warm_up2;

public class Array667 {
    public int array667(int[] nums) {
        int count = 0;
        // Note: iterate to length-1, so can use i+1 in the loop
        for (int i=0; i < (nums.length-1); i++) {
            if (nums[i] == 6) {
                if (nums[i+1] == 6 || nums[i+1] == 7) {
                    count++;
                }
            }
        }
        return count;
    }
}

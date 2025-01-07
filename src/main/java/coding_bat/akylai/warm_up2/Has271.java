package coding_bat.akylai.warm_up2;

public class Has271 {
    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] + 5 == nums[i+1] && nums[i+1] - nums[i+2] >= 4 && nums[i+1] - nums[i+2] <= 8 ) {
                return true;
            }
        }
        return false;
    }
}

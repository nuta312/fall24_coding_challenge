package coding_bat.aiperiishenbekkyzy.warm_up2;

public class noTriples {
    public boolean noTriples(int[] nums) {
        int count = 0;
        for (int i = 0 ; i < nums.length - 1;i++) {
            if (i+2 <= nums.length -1) {
                if (nums[i] == nums[i+1] && nums[i] == nums[i+2])
                return false;
            }
        } return true;

    }

}

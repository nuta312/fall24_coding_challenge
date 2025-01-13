package coding_bat.dastanA.warm_up2;

public class NoTriples {
    public boolean noTriples(int[] nums) {
        if (nums.length < 3) {
            return true;
        }

        int count = 0;
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i] == nums[i+1] && nums[i+1] == nums[i+2]) {
                count++;
            }
        }
        if (count >= 1) {
            return false;
        }
        return true;
    }
}

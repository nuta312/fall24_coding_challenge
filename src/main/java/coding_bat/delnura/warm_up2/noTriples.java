package coding_bat.delnura.warm_up2;

public class noTriples {
    public boolean noTriples(int[] nums) {
        if (nums.length < 3) {
            return true;
        }

        for (int i = 0; i < nums.length - 2; i++) {

            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                return false;
            }
        }

        return true;

    }
}

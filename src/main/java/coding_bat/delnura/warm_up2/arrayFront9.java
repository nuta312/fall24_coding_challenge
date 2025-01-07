package coding_bat.delnura.warm_up2;

public class arrayFront9 {
    public boolean arrayFront9(int[] nums) {
        int limit = Math.min(nums.length, 4);

        for (int i = 0; i < limit; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }

        return false;
    }
}

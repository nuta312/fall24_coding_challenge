package coding_bat.dastanA.array_1;

public class Unlucky1 {
    public boolean unlucky1(int[] nums) {
        boolean result = false;
        if (nums.length < 2) {
            result = false;
        }
        else if (nums.length > 1) {
            if ((nums[0] == 1 && nums[1] == 3) ||
                    (nums[1] == 1 && nums[2] == 3) ||
                    (nums[nums.length-2] == 1 && nums[nums.length-1] == 3)) {
                result = true;
            }
        } else {
            result = false;
        }
        return result;
    }
}

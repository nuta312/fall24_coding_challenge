package coding_bat.anara.warm_up2;

public class has271 {
    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int digit = nums[i];
            if (nums[i] == digit && nums[i + 1] == digit + 5
                    && ((nums[i + 2] == digit - 1)
                    || (nums[i + 2] == digit - 3) || (nums[i + 2] == digit + 1) || (nums[i + 2] == digit ))){
                return true;
            }

        }return false;
    }
}

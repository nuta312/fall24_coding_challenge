package coding_bat.begimai.warm_up2;

public class Array123 {
    public boolean array123(int[] nums) {
        // Loop through the array
        for (int i = 0; i < nums.length - 2; i++) {
            // Check if the sequence 1, 2, 3 appears
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }
}

package coding_bat.mirat.warm_up2;

public class Has271 {
    public boolean has271(int[] nums) {
        // Loop through the array up to length - 2
        for (int i = 0; i < nums.length - 2; i++) {
            int value = nums[i];
            // Check if the next element is value + 5 and the third element is close to value - 1
            if (nums[i + 1] == value + 5 && Math.abs(nums[i + 2] - (value - 1)) <= 2) {
                return true; // Found the 271 pattern
            }
        }
        return false; // No 271 pattern found
    }

}

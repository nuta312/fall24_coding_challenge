package coding_bat.begimai.warm_up2;

public class ArrayFront9 {
    public boolean arrayFront9(int[] nums) {
        // Determine the end of the loop (either array length or 4, whichever is smaller)
        int end = Math.min(nums.length, 4);

        // Loop through the first 'end' elements
        for (int i = 0; i < end; i++) {
            if (nums[i] == 9) {
                return true; // Found a 9 in the range
            }
        }
        return false;
    }
}

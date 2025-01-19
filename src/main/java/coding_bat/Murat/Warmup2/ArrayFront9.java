package coding_bat.Murat.Warmup2;

public class ArrayFront9 {
    public boolean arrayFront9(int[] nums) {
        if (nums.length >= 4) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == 9) return true;
            }
        } else if (nums.length < 4) {
            for (int j = 0; j < nums.length; j++)
                if (nums[j] == 9) return true;
        }
        return false;
    }
}

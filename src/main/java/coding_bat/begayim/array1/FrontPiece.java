package coding_bat.begayim.array1;

public class FrontPiece {
    public int[] frontPiece(int[] nums) {
        if (nums.length < 2) {
            return nums;
        }
        return new int[]{nums[0], nums[1]};
    }
}

package coding_bat.akylai.array_1;

public class FrontPiece {
    public int[] frontPiece(int[] nums) {
        if (nums.length == 1) return new int[] {nums[0]};
        if (nums.length == 0) return new int[] {};

        return new int[] {nums[0], nums[1]};
    }

}

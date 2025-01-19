package coding_bat.dastanA.array_1;

public class FrontPiece {
    public int[] frontPiece(int[] nums) {
        int[] newNums = new int[2];

        if (nums.length < 2) {
            newNums = nums;
        } else if (nums.length > 1) {
            newNums[0] = nums[0];
            newNums[1] = nums[1];
        }

        return newNums;
    }
}

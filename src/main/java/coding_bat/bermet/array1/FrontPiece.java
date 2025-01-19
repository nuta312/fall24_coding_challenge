package coding_bat.bermet.array1;

public class FrontPiece {
    public int[] frontPiece(int[] nums) {
        if (nums.length < 2){
            return nums;
        }
        int [] nums2 = {nums[0], nums[1]};
        return nums2;
    }
}

package coding_bat.aiperiishenbekkyzy.array_1;

public class frontPiece {
    public int[] frontPiece(int[] nums) {
        if(nums.length < 2)
            return nums;
        int [] newArray = {nums[0], nums[1]};
        return newArray;

    }

}

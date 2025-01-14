package coding_bat.dastanA.array_1;

public class MakeMiddle {
    public int[] makeMiddle(int[] nums) {
        int[] newNums = new int[2];
        newNums[0] = nums[nums.length/2-1];
        newNums[1] = nums[nums.length/2];
        return newNums;
    }
}

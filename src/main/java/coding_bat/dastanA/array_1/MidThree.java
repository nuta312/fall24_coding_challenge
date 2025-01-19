package coding_bat.dastanA.array_1;

public class MidThree {
    public int[] midThree(int[] nums) {
        int[] newNums = new int[3];
        newNums[0] = nums[nums.length/2 - 1];
        newNums[1] = nums[nums.length/2];
        newNums[2] = nums[nums.length/2 + 1];
        return newNums;
    }
}

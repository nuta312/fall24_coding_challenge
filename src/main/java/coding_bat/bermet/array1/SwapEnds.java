package coding_bat.bermet.array1;

public class SwapEnds {
    public int[] swapEnds(int[] nums) {
        int result[];
        if (nums.length == 1) {
            return nums;
        }
        int temp = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length - 1] = temp;

        return nums;
    }
}

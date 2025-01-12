package coding_bat.bermet.array1;

public class MakeMiddle {
    public int[] makeMiddle(int[] nums) {
        int middle = nums.length / 2;
        int[] nums2 = {nums[middle - 1], nums[middle]};
        return nums2;
    }
}

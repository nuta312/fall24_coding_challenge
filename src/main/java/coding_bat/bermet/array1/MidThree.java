package coding_bat.bermet.array1;

public class MidThree {
    public int[] midThree(int[] nums) {
        int middle = nums.length / 2;
        int[] nums2 = {nums[middle-1], nums[middle], nums[middle + 1]};
        return nums2;
    }
}

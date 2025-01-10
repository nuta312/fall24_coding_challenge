package coding_bat.begayim.array1;

public class MakeMiddle {
    public int[] makeMiddle(int[] nums) {
        int middle1 = nums[nums.length / 2 - 1];
        int middle2 = nums[nums.length / 2];
        return new int[] {middle1, middle2};
    }
}

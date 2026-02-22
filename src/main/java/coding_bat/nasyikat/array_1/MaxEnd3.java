package coding_bat.nasyikat.array_1;

public class MaxEnd3 {
    public int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[2]);
        for (int i = 0; i < nums.length; i++) {
            nums[i]=max;
        }
        return nums;
    }
}

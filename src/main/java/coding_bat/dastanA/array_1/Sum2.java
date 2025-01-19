package coding_bat.dastanA.array_1;

public class Sum2 {
    public int sum2(int[] nums) {
        int result = (nums.length == 1) ? nums[0] : (nums.length >= 2) ? nums[0] + nums[1] : 0;
        return result;
    }
}

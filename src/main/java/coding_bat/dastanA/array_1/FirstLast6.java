package coding_bat.dastanA.array_1;

public class FirstLast6 {
    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length-1] == 6) {
            return true;
        } else {
            return false;
        }
    }
}

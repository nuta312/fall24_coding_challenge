package coding_bat.dastanA.array_1;

public class SameFirstLast {
    public boolean sameFirstLast(int[] nums) {
        if (nums.length > 0 && nums[0] == nums[nums.length-1]){
            return true;
        } else {
            return false;
        }
    }
}

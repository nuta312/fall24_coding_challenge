package coding_bat.delnura.array_1;

public class sameFirstLast {
    public boolean sameFirstLast(int[] nums) {

        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
    }
}

package coding_bat.Murat.Array1;

public class FirstLast6 {
    public boolean firstLast6(int[] nums) {
        if (nums.length == 1 && nums[0] == 6) return true;
        else if (nums.length >= 2 && (nums[0] == 6 || nums[nums.length - 1] == 6)) return true;
        return false;
    }
}
package coding_bat.Murat.Array1;

public class Reverse3 {
    public int[] reverse3(int[] nums) {
        int num = nums[0];
        nums[0] = nums[2];
        nums[2] = num;
        return nums;
    }
}

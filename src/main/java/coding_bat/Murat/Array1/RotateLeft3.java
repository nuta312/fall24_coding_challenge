package coding_bat.Murat.Array1;

public class RotateLeft3 {
    public int[] rotateLeft3(int[] nums) {
        int first = nums[0];
        int mid = nums[1];
        int last = nums[2];
        nums[0] = mid;
        nums[1] = last;
        nums[2] = first;
        return nums;
    }
}
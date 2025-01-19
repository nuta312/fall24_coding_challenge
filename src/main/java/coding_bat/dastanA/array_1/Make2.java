package coding_bat.dastanA.array_1;

public class Make2 {
    public int[] make2(int[] a, int[] b) {
        int[] nums = new int[2];
        if (a.length < 1) {
            nums[0] = b[0];
            nums[1] = b[1];
        } else if (a.length == 1) {
            nums[0] = a[0];
            nums[1] = b[0];
        } else if (a.length > 1) {
            nums[0] = a[0];
            nums[1] = a[1];
        }
        return nums;
    }
}

package coding_bat.dastanA.array_1;

public class Front11 {
    public int[] front11(int[] a, int[] b) {
        int[] nums = new int[2];
        int[] num = new int[1];
        int[] num2 = new int[0];
        if (a.length > 0 && b.length > 0){
            nums[0] = a[0];
            nums[1] = b[0];
        } else if (a.length > 0 && b.length < 1) {
            num[0] = a[0];
            nums = num;
        } else if (a.length < 1 && b.length > 0) {
            num[0] = b[0];
            nums = num;
        } else if (a.length < 1 && b.length < 1) {
            nums = num2;
        }
        return nums;
    }
}

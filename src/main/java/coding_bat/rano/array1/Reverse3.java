package coding_bat.rano.array1;

public class Reverse3 {
    public int[] reverse3(int[] nums) {
        int[] reverse = new int[3];
        reverse[0] = nums[2];
        reverse[1] = nums[1];
        reverse[2] = nums[0];
        return reverse;
    }
}
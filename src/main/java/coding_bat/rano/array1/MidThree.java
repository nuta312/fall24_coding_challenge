package coding_bat.rano.array1;

public class MidThree {
    public int[] midThree(int[] nums) {
        int[] arr = new int[3];
        arr[0] = nums[nums.length / 2 - 1];
        arr[1] = nums[nums.length / 2];
        arr[2] = nums[nums.length / 2 + 1];
        return arr;
    }
}

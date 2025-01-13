package coding_bat.begayim.array1;

public class MakeEnds {
    public int[] makeEnds(int[] nums) {
        int[] arr = new int[2];
        arr[0] = nums[0];
        arr[1] = nums[nums.length-1];
        return arr;
    }
}

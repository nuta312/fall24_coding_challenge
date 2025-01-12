package coding_bat.Maksim.array1;

public class makeLast {
    public int[] makeLast(int[] nums) {

        int[] result = new int[2 * nums.length];
        result[result.length - 1] = nums[nums.length - 1];
        return result;
    }

}

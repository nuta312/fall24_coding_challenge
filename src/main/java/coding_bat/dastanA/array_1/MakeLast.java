package coding_bat.dastanA.array_1;

public class MakeLast {
    public int[] makeLast(int[] nums) {
        int [] numbers = new int[nums.length * 2];
        numbers [numbers.length-1] = nums[nums.length-1];
        return numbers;
    }
}

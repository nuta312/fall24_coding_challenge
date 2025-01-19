package coding_bat.dastanA.array_1;

public class SwapEnds {
    public int[] swapEnds(int[] nums) {
        int[] numbers = nums;
        int num1 = nums[0];
        int num2 = nums[nums.length-1];

        if (nums.length > 1) {
            numbers[numbers.length-1] = num1;
            numbers[0] = num2;
        }
        return numbers;
    }
}

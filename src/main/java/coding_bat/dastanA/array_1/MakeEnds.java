package coding_bat.dastanA.array_1;

public class MakeEnds {
    public int[] makeEnds(int[] nums) {
        int [] numbers = new int [2];
        numbers[0] = nums[0];
        numbers[1] = nums[nums.length-1];
        return numbers;
    }
}

package coding_bat.dastanA.array_1;

public class Fix23 {
    public int[] fix23(int[] nums) {
        int [] numbers = new int[3];
        if (nums[0] == 2 && nums[1] == 3) {
            numbers = new int[] {nums[0],0,nums[2]};
        }
        else if (nums[1] == 2 && nums[2] == 3) {
            numbers = new int[] {nums[0],nums[1],0};
        }
        else {
            numbers = new int[] {nums[0],nums[1],nums[2]};
        }
        return numbers;
    }
}

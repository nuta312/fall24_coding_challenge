package coding_bat.rano.array1;

public class MakeMiddle {
    public int[] makeMiddle(int[] nums) {
        return new int[]{
                nums[nums.length / 2 -1], nums[nums.length /2]};
    }
}

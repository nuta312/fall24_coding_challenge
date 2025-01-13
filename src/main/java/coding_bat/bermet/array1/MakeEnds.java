package coding_bat.bermet.array1;

public class MakeEnds {
    public int[] makeEnds(int[] nums) {
        int result[] = {nums[0], nums[nums.length-1]};
        return result;
    }
}

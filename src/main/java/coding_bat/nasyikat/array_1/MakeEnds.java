package coding_bat.nasyikat.array_1;

public class MakeEnds {
    public int[] makeEnds(int[] nums) {
        int fl[] = new int[2];
        fl[0] = nums[0];
        fl[1] = nums[nums.length-1];
        return fl;
    }
}

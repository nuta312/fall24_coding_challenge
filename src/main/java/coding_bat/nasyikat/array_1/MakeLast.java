package coding_bat.nasyikat.array_1;

public class MakeLast {
    public int[] makeLast(int[] nums) {
        int[] newn = new int [nums.length * 2];
        newn[newn.length-1] = nums[nums.length-1];
        return newn;
    }
}

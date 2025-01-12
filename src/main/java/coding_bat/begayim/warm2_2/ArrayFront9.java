package coding_bat.begayim.warm2_2;

public class ArrayFront9 {
    public boolean arrayFront9(int[] nums) {
        int firstFour = Math.min(nums.length,4);
        for (int i = 0; i < firstFour; i++) {
            if (nums[i] == 9){
                return true;
            }
        }
        return false;
    }
}

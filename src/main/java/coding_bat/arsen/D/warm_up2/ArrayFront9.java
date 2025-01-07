package coding_bat.arsen.D.warm_up2;

public class ArrayFront9 {
    public boolean arrayFront9(int[] nums) {
        int limit = Math.min(nums.length, 4);
        for (int i = 0 ; i <limit; i++){
            if (nums[i] == 9){
                return true;
            }
        }
        return false;
    }

}

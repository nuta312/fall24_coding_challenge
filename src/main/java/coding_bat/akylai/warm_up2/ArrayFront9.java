package coding_bat.akylai.warm_up2;

public class ArrayFront9 {
    public boolean arrayFront9(int[] nums) {
        int i = 0;
        while(i < nums.length && i < 4){
            if (nums[i] == 9) {
                return true;
            }
            i++;
        }
        return false;
    }
}

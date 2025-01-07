package coding_bat.daulet.warm_up2;

public class arrayFront9 {
    public boolean arrayFront9(int[] nums) {

        if(nums.length>=4){
            for (int i = 0; i < nums.length-2; i++) {
                if (nums[i] == 9) {
                    return true;
                }
            }
        }else if(nums.length<4){
            for (int i = 0; i < nums.length; i++) {
                if (nums[i]==9){
                    return true;
                }
            }return false;
        }return false;

    }
}

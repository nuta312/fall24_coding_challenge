package coding_bat.dastank.warm_up2;

public class ArrayFront9 {
    public boolean arrayFront9(int[] nums) {
        if(nums.length>4){
            for(int a = 0; a<4; a++){
                if(nums[a]== 9){
                    return true;
                }
            }return false;
        }else{
            for(int a : nums){
                if(a==9){
                    return true;
                }
            }return false;
        }
    }

}

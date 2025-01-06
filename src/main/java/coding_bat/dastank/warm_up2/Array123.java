package coding_bat.dastank.warm_up2;

public class Array123 {
    public boolean array123(int[] nums) {
        if(nums.length>=3){
            for(int a = 0; a<nums.length-1;a++){
                if(nums[a]==1&&nums[a+1]==2&&nums[a+2]==3){
                    return true;
                }
            }return false;
        }else{
            return false;
        }

    }
}

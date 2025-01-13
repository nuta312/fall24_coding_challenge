package coding_bat.daulet.array1;

public class frontPiece {
    public int[] frontPiece(int[] nums) {

        if(nums.length == 0){
            int[] z = {};
            return z;
        }
        if(nums.length >= 2){
            int[]v = {nums[0],nums[1]};
            return v;
        }int[]c = {nums[0]};
        return c;
    }
}

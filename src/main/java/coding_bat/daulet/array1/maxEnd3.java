package coding_bat.daulet.array1;

public class maxEnd3 {
    public int[] maxEnd3(int[] nums) {
        if (nums[0] > nums[2]){
            int[] v = {nums[0], nums[0], nums[0]};
            return v;
        }else {
            int[] x = {nums[2] ,nums[2], nums[2]};
            return x;
        }
    }
}

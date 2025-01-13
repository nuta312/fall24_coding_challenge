package coding_bat.bermet.warmup2;

public class NoTriples {
    public boolean noTriples(int[] nums) {
        int count = 0;
        if (nums.length < 3){
            return true;
        }
        for (int i = 0; i < nums.length-1; i ++){
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]){
                return false;
            }
        }
        return true;
    }
}

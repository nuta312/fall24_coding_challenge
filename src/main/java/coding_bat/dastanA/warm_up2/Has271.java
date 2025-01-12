package coding_bat.dastanA.warm_up2;

public class Has271 {
    public boolean has271(int[] nums) {
        if (nums.length < 3){
            return false;
        }
        int count = 0;
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i+1] == nums[i] + 5 &&
                    (nums[i+2] == nums[i] - 1 ||
                            nums[i+2] == nums[i] - 1 + 2 ||
                            nums[i+2] == nums[i] - 1 + 1 ||
                            nums[i+2] == nums[i] - 1 - 2 ||
                            nums[i+2] == nums[i] - 1 - 1 )) {
                count++;
            }
        }
        if (count > 0) {
            return true;
        }
        return false;
    }
}

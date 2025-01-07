package coding_bat.anara.warm_up2;

public class noTriples {public boolean noTriples(int[] nums) {
    for (int i = 0; i < nums.length - 2; i++){
        int digit = nums[i];
        if (nums[i+1] == digit && nums[i+2] == digit)
            return false;
    }
    return true;
}

}

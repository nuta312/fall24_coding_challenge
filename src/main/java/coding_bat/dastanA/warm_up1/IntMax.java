package coding_bat.dastanA.warm_up1;

public class IntMax {
    public int intMax(int a, int b, int c) {
        int[] nums = {a, b, c};
        int max = nums [0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums [i];
            }
        }
        return max;
    }
}

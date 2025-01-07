package coding_bat.aiperiishenbekkyzy.warm_up2;

public class arrayCount9 {
    public int arrayCount9(int[] nums) {
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 9)

                counter++;

        }

        return counter;
    }
}

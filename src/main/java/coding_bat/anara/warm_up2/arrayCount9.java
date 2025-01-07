package coding_bat.anara.warm_up2;

public class arrayCount9 {
    public int arrayCount9(int[] nums) {
        int digit = 9;
        int count = 0;
        for (int num : nums){
            if (num == digit){
                count++;
            }

        }
        return count;
    }

}

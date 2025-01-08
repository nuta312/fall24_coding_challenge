package coding_bat.akylai.warm_up2;

public class Array667 {
    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            // Проверяем, что пара состоит из 6 и 6 или 6 и 7
            if ((nums[i] == 6 && nums[i + 1] == 6) || (nums[i] == 6 && nums[i + 1] == 7)) {
                count++;
            }
        }
        return count;
    }
}

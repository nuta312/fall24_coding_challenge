package coding_bat.aiza.warmup_2;

public class arrayFront9 {
    public boolean arrayFront9(int[] nums) {
        int end = Math.min(nums.length, 4);
        for (int i = 0; i < end; i++) {
            if (nums[i] == 9) {
                return true; // Если нашли 9, возвращаем true
            }
        }
        return false;
    }
}

package coding_bat.delnura.warm_up2;

public class has271 {
    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int val = nums[i];  // Сохраняем текущее значение

            if (nums[i + 1] == (val + 5) && Math.abs(nums[i + 2] - (val - 1)) <= 2) {
                return true;  // Если все условия выполнены, возвращаем true
            }
        }
        return false;

    }

}

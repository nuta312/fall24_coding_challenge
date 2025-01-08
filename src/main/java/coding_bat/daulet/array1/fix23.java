package coding_bat.daulet.array1;

public class fix23 {
    public int[] fix23(int[] nums) {
        // Проходим по массиву, но до предпоследнего элемента
        for (int i = 0; i < nums.length - 1; i++) {
            // Если текущий элемент 2, а следующий 3
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0; // Заменяем 3 на 0
            }
        }
        return nums;
    }
}

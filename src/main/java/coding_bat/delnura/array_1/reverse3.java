package coding_bat.delnura.array_1;

public class reverse3 {
    public int[] reverse3(int[] nums) {
        int[] reversed = new int[nums.length];

        // Переворачиваем элементы
        for (int i = 0; i < nums.length; i++) {
            reversed[i] = nums[nums.length - 1 - i];  // Ставим элементы в обратном порядке
        }

        return reversed;
    }
}

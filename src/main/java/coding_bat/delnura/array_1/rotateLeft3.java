package coding_bat.delnura.array_1;

public class rotateLeft3 {
    public int[] rotateLeft3(int[] nums) {
        int[] rotated = new int[nums.length];

        for (int i = 0; i < nums.length - 1; i++) {
            rotated[i] = nums[i + 1];  // Сдвигаем элементы на одну позицию влево
        }
        rotated[nums.length - 1] = nums[0];  // Первый элемент перемещаем в конец

        return rotated;
    }
}

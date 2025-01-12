package coding_bat.Maksim.array1;

public class swapEnds {
    public int[] swapEnds(int[] nums) {

        // Меняем местами первый и последний элементы
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;

        return nums;

    }
}

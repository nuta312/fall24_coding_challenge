package coding_bat.delnura.array_1;

public class maxEnd3 {
    public int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[nums.length - 1]);  // Находим большее из первого и последнего элемента

        for (int i = 0; i < nums.length; i++) {
            nums[i] = max;
        }

        return nums;
    }
}

package coding_bat.bermet.array1;

public class MaxEnd3 {
    public int[] maxEnd3(int[] nums) {
        int result[] = {};
        if (nums[0] > nums[2]){
            int num0[] = {nums[0], nums[0], nums[0]};
            result = num0;
        } else  if (nums[0]< nums[2]){
            int num2[] = {nums[2], nums[2], nums[2]};
            result = num2;
        } else if (nums[0] == nums[2]){
            int num1[] = {nums[0], nums[0], nums[0]};
            result = num1;
        }
        return result;
    }
}

package coding_bat.Maksim.array1;

public class sum2 {
    public int sum2(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length >=2){
            return nums[0]+ nums[1];
        }else if(nums.length <2){
            return nums[0];
        }return 0;
    }
}

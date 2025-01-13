package coding_bat.daulet.array1;

public class sameFirstLast {
    public boolean sameFirstLast(int[] nums) {

        if(nums.length == 0){
            return false;
        }
        if (nums[0] == nums[nums.length-1]){
            return true;
        }else {
            return false;
        }
    }

}

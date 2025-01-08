package coding_bat.begimai.warm_up2;

public class ArrayCount9 {
    public int arrayCount9(int[] nums) {
        int counter = 0;
        for(int n : nums){
            if(n == 9){
                counter++;
            }
        }
        return counter;
    }
}

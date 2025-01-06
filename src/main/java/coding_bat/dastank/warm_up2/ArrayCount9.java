package coding_bat.dastank.warm_up2;

public class ArrayCount9 {
    public int arrayCount9(int[] nums) {
        int a=0;
        for(int b:nums){
            if(b==9){
                a++;
            }
        }return a;
    }

}

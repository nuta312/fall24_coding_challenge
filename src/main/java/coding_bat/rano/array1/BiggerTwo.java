package coding_bat.rano.array1;

public class BiggerTwo {
    public int[] biggerTwo(int[] a, int[] b) {
        int aTotal  = a[0] + a [1];
        int bTotal = b[0] + b[1];
        if (aTotal == bTotal){
            return a;
        } else if(aTotal > bTotal){
            return a;
        } else {
            return b;
        }
    }
}

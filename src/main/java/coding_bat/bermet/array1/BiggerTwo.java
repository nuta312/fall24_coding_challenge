package coding_bat.bermet.array1;

public class BiggerTwo {
    public int[] biggerTwo(int[] a, int[] b) {
        int a1 = a[0] + a[1];
        int b1 = b[0] + b[1];
        if (a1 == b1){
            return a;
        }
        if (a1 > b1) {
            return a;
        } else {
            return b;
        }
    }
}

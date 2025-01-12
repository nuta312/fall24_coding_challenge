package coding_bat.akylai.array_1;

public class BiggerTwo {
    public int[] biggerTwo(int[] a, int[] b) {
        int sumA = 0;
        for (int i = 0; i < a.length; i++) {
            sumA+= a[i];
        }
        int sumB = 0;
        for (int i = 0; i < b.length; i++) {
            sumB+= b[i];
        }
        if (sumA > sumB || sumA == sumB){
            return a;
        } else {
            return b;
        }
    }
}

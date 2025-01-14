package coding_bat.dastanA.array_1;

public class BiggerTwo {
    public int[] biggerTwo(int[] a, int[] b) {
        int [] num = new int[2];
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];
        if (sumA > sumB) {
            num = a;
        } else if (sumA < sumB) {
            num = b;
        } else if (sumA == sumB) {
            num = a;
        }
        return num;
    }
}

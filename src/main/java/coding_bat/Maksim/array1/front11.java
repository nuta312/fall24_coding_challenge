package coding_bat.Maksim.array1;

public class front11 {
    public int[] front11(int[] a, int[] b) {
        if (a.length >=1 && b.length >=1){
            int[] x = {a[0],b[0]};
            return x;
        } else if (a.length >=1 && b.length == 0) {
            int[]d = {a[0]};
            return d;
        } else if (a.length ==0 && b.length >=1) {
            int[] f = {b[0]};
            return f;
        }int[] m = {};
        return m;

    }
}

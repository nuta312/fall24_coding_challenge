package coding_bat.Maksim.array1;

public class make2 {
    public int[] make2(int[] a, int[] b) {

        if (a.length == 2 || a.length > 2){
            int[]ss = {a[0],a[1]};
            return ss;
        } else if (a.length == 1) {
            int[] cc = {a[0],b[0]};
            return cc;
        }else {
            int[] nn = {b[0],b[1]};
            return nn;
        }
    }
}

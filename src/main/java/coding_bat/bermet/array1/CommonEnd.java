package coding_bat.bermet.array1;

public class CommonEnd {
    public boolean commonEnd(int[] a, int[] b) {
        if (a.length >= 1 && b.length >= 1){
            if (a[0] == b[0] || a[a.length-1] == b[b.length-1]){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

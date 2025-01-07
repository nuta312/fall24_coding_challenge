package coding_bat.aidana.warm_up1.array1;

public class commonEnd {
    public boolean commonEnd(int[] a, int[] b) {
        if (a [0] == b [0]){
            return true;
        } if (a[a.length - 1] == b[b.length - 1]){
            return true;
        }
        else {
            return false;
        }}
}

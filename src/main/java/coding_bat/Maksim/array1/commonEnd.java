package coding_bat.Maksim.array1;

public class commonEnd {
    public boolean commonEnd(int[] a, int[] b) {

        if (a[0] == b[0] || a[a.length-1]== b[b.length-1]){
            return true;
        }else {
            return false;
        }

    }
}

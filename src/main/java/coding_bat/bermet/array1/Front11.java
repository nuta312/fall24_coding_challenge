package coding_bat.bermet.array1;

public class Front11 {
    public int[] front11(int[] a, int[] b) {
        int[] newArray= {};
        if (a.length == 0 && b.length > 0){
            newArray =new int[]{b[0]};
        } else if (b.length == 0 && a.length > 0){
            newArray = new int[] {a[0]};
        } else if (a.length == 0 && b.length == 0){
            return a;
        } else if (a.length > 0 && b.length > 0){
            newArray = new int[] {a[0],b[0]};
        }
        return newArray;
    }
}

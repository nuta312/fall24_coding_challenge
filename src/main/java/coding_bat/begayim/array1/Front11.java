package coding_bat.begayim.array1;

public class Front11 {
    public int[] front11(int[] a, int[] b) {
        boolean hasA = a.length > 0;
        boolean hasB = b.length > 0;
        int[] result = new int[(hasA ? 1 : 0) + (hasB ? 1 : 0)];
        int index = 0;

        if (hasA) {
            result[index] = a[0];
            index++;
        }
        if (hasB) {
            result[index] = b[0];
        }
        return result;
    }
}

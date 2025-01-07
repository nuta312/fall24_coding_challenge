package coding_bat.aidana.warm_up1.array1;

public class middleWay {
    public int[] middleWay(int[] a, int[] b) {
        int middleA = a[a.length / 2];
        int middleB = b[b.length / 2];
        return new int[]{middleA, middleB};
    }
}

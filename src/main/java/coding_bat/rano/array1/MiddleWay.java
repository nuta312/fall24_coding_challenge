package coding_bat.rano.array1;

public class MiddleWay {
    public int[] middleWay(int[] a, int[] b) {
        if(a.length == 3 && b.length == 3){
            return new int[]{a[1], b[1] };
        }
        return new int[0];
    }
}

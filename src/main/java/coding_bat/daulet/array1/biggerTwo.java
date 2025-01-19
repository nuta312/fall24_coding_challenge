package coding_bat.daulet.array1;

public class biggerTwo {
    public int[] biggerTwo(int[] a, int[] b) {

        int d = a[0]+a[1];
        int v = b[0]+b[1];

        if(d > v){
            return a;
        }else if(d < v){
            return b;
        }return a;
    }
}

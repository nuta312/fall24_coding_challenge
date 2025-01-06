package coding_bat.nasyikat.warm_up1;

public class IntMax {
    public int intMax(int a, int b, int c) {
        int max;
        if (a > b) {
            max = a;}
        else { max = b;
        }
        if ( max < c){ max = c;}
        return max;
    }
}

package coding_bat.bermet.warmup1;

public class intMax {
    public int intMax(int a, int b, int c) {
        int num = 0;
        if (a > b && a > c){
            num = a;
        } else if (b > a && b > c){
            num = b;
        } else if (c > a && c > b){
            num = c;
        }
        return num;
    }
}

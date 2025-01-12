package coding_bat.bermet.warmup1;

public class Close10 {
    public int close10(int a, int b) {
        int num = 0;
        if (a == b){
            num = 0;
        }
        int diffA = (Math.abs(a - 10));
        int diffB = (Math.abs(b - 10));
        if (diffA > diffB){
            num = b;
        } else if (diffA < diffB){
            num = a;
        }
        return num;
    }
}

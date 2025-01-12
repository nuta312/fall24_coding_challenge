package coding_bat.rano.logic2;

public class EvenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
        if( a == b && b==c) return true;
        if(a==b || b==c || c==a) return false;
        return((Math.abs(a-b) == Math.abs(b-c)) || (Math.abs(a-b) == Math.abs(a-c)) || (Math.abs(c-b) == Math.abs(a-c)));
    }
}

package coding_bat.dastank.warm_up1;

public class IntMax {
    public int intMax(int a, int b, int c) {
        if(a>b&&a>c){
            return a;
        }else if(b>a&&b>c){
            return b;
        }else{
            return c;
        }
    }
}

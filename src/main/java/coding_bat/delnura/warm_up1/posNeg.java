package coding_bat.delnura.warm_up1;

public class posNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        if(negative){
            return a < 0 && b < 0;
        }
        return (a < 0 && b >0) || (a >0 && b < 0);
    }
}

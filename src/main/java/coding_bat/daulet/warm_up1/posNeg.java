package coding_bat.daulet.warm_up1;

public class posNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        if(a < 0 && b < 0 && negative == true){
            return true;
        }else if(((a > 0 && b < 0)|| (a < 0 && b > 0)) && negative == false){
            return true;
        }return false;
    }
}

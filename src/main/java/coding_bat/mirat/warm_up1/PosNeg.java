package coding_bat.mirat.warm_up1;

public class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        if (a > 0 && b < 0 && negative == false){
            return true;
        }
        else if (a <0 && b > 0 && negative == false){
            return true;
        }
        else if (a < 0 && b < 0 && negative == true){
            return true;
        }
        else if (a < 0 && b < 0 && negative == false){
            return false;
        }
        else if (a < 0 && b > 0 && negative == true){
            return false;
        }
        else if (a > 0 && b > 0 && negative == false){
            return false;
        }
        else if (a > 0 && b < 0 && negative == true){
            return false;
        }
        else if (a > 0 && b < 0 && negative == true){
            return false;
        }
        return false;
    }
}

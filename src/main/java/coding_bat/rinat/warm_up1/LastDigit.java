package coding_bat.rinat.warm_up1;

public class LastDigit {
    public boolean lastDigit(int a, int b) {
        if (a < 10 && b >= 10){
            int c = b % 10;
            if (a == c){
                return true;
            }else {
                return false;
            }
        } else if (b < 10 && a >= 10) {
            int c = a % 10;
            if (b == c){
                return true;
            }else {
                return false;
            }
        } else if (b == a) {
            return true;
        } else {
            return false;
        }
    }

}

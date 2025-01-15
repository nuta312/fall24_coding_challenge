package coding_bat.abdykadyrov_turan.warm_up1;

public class LastDigit {
    public boolean lastDigit(int a, int b) {
        if (a % 10 == b % 10) {
            return true;
        } else {
            return false;
        }
    }
}

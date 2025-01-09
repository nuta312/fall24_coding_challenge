package coding_bat.dastanA.warm_up1;

public class LastDigit {
    public boolean lastDigit(int a, int b) {
        if(a == b || a % 10 == b || b % 10 == a) {
            return true;
        }
        return false;
    }
}

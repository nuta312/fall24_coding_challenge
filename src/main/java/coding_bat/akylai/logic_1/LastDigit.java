package coding_bat.akylai.logic_1;

public class LastDigit {
    public boolean lastDigit(int a, int b, int c) {
        if (a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10) {
            return true;
        } else {
            return false;
        }
    }
}

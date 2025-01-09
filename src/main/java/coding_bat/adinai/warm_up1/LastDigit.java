package coding_bat.adinai.warm_up1;

public class LastDigit {
    public boolean lastDigit(int a, int b) {
        return ((b % 10) == a) || ((a % 10) == b);
    }
}

package coding_bat.gulasal.warm_up1;

public class LastDigit {
    public boolean lastDigit(int a, int b) {
        int aResult = a%10;
        int bResult = b%10;
        return aResult == bResult;
    }
}

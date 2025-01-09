package coding_bat.aiza.warm_up1;

public class lastDigit {
    public boolean lastDigit(int a, int b) {
        int lastDigitA = a % 10;
        int lastDigitB = b % 10;
        return lastDigitA == lastDigitB;
    }
}

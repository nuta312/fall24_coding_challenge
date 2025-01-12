package coding_bat.begayim.logic1;

public class LastDigit {
    public static boolean lastDigit(int a, int b, int c) {
        int aRightmost = a % 10;
        int bRightmost = b % 10;
        int cRightmost = c % 10;

        return (aRightmost == bRightmost) || (aRightmost == cRightmost) || (bRightmost == cRightmost);
    }
}

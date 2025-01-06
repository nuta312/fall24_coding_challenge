package coding_bat.nasyikat.warm_up1;

public class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0); // если оба отрицательные true
        }
        else { // если одно из вдух чисел положительное то false
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }
}

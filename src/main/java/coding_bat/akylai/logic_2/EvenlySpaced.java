package coding_bat.akylai.logic_2;

public class EvenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
        if ((a - b) == (b - c) || (c - a) == (a - b) || (a-c) == (c-b)) {
            return true;
        } else {
            return false;
        }
    }
}

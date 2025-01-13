package coding_bat.akylai.logic_1;

public class InOrder {
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (a < b && b < c) {
            return true;
        }
        if (bOk) {
            return c > b;
        }
        return false;
    }
}

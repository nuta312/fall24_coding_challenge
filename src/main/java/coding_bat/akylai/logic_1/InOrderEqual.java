package coding_bat.akylai.logic_1;

public class InOrderEqual {
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (!equalOk && a < b && b < c) {
            return true;
        }
        else if (equalOk && a <= b && b <= c) {
            return true;
        }
        return false;
    }
}

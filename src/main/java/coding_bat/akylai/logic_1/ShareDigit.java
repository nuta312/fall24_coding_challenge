package coding_bat.akylai.logic_1;

public class ShareDigit {
    public boolean shareDigit(int a, int b) {
        int aLeft = a / 10;
        int aRight = a % 10;
        int bLeft = b / 10;
        int bRight = b % 10;
        if (aLeft == bLeft || aLeft == bRight || aRight == bLeft || aRight == bRight) {
            return true;
        } else {
            return false;
        }
    }

}

package coding_bat.akylai.logic_1;

public class Near10 {
    public boolean nearTen(int num) {
        if (num % 10  < 3 || num % 10 >= 8) {
            return true;
        } else {
            return false;
        }
    }
}

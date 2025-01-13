package coding_bat.akylai.logic_1;

public class Love6 {
    public boolean love6(int a, int b) {
        int sum = a + b;
        int dif = a - b;
        int dif1 = b - a;
        if (a == 6 || b == 6 || sum == 6 || dif == 6 || dif1 == 6) {
            return true;
        } else {
            return false;
        }
    }
}

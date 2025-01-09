package coding_bat.aiza.logic_1;

public class sortaSum {
    public int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        return sum;
    }
}

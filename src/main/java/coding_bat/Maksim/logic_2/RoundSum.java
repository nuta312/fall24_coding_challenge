package coding_bat.Maksim.logic_2;

public class RoundSum {
    public int roundSum(int a, int b, int c) {
        if (a % 10 >= 5) {
            a = (a / 10 + 1) * 10;
        } else {
            a = (a / 10) * 10;
        }
        if (b % 10 >= 5) {
            b = (b / 10 + 1) * 10;
        } else {
            b = (b / 10) * 10;
        }
        if (c % 10 >= 5) {
            c = (c / 10 + 1) * 10;
        } else {
            c = (c / 10) * 10;
        }
        int sum = a + b + c;
        return sum; // Ожидается 60 (20 + 20 + 20)
    }
}

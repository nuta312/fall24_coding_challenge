package coding_bat.akylai.logic_2;

public class RoundSum {
    public int roundSum(int a, int b, int c) {
        int sum = round10(a) + round10(b) + round10(c);
        return sum;
    }
    public int round10(int num) {
        int remainder = num % 10;
        if (remainder < 5) {
            return num - remainder;
        } else {
            return num + (10 - remainder);
        }
    }
}

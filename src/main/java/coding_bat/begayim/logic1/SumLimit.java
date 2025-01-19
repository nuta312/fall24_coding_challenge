package coding_bat.begayim.logic1;

public class SumLimit {
    public int sumLimit(int a, int b) {
        int sum = a + b;
        int aDigits = String.valueOf(a).length();
        int sumDigits = String.valueOf(sum).length();

        if (sumDigits > aDigits) {
            return a;
        } else {
            return sum;
        }
    }
}

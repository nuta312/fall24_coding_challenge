package coding_bat.nasyikat.logic_2;

public class LuckySum {
    public int luckySum(int a, int b, int c) {
        if (a == 13 && b == 13) {
            return 0;
        }
        if (b == 13) {
            return a;
        }
        if (a == 13 && c == 13) {
            return 0;
        }
        if (c == 13) {
            return a + b;
        }
        if (a == 13) {
            return 0;
        }
        return a + b + c;
    }
}

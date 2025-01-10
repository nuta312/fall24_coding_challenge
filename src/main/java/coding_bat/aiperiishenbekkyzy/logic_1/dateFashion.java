package coding_bat.aiperiishenbekkyzy.logic_1;

public class dateFashion {
    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;  // Either you or your date has very low style, so the answer is "no" (0).
        } else if (you >= 8 || date >= 8) {
            return 2;  // Either you or your date is very stylish, so the answer is "yes" (2).
        } else {
            return 1;  // Neither very low nor very high stylishness, so the answer is "maybe" (1).
        }
    }
}

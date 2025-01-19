package coding_bat.Murat.Warmup2;

public class Last2 {
    public int last2(String str) {
        int count = 0;
        if (str.length() <= 1) return count;
        if (str.length() > 1) {
            String lastTwo = str.substring(str.length() - 2);
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.substring(i, i + 2).equals(lastTwo)) {
                    count++;
                }
            }
        }
        return count;
    }
}

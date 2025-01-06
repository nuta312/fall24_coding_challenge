package coding_bat.nasyikat.warm_up2;

public class Last2 {
    public int last2(String str) {
        if (str.length() < 2) {
            return 0;
        }
        int count = 0;
        String lastTwo = str.substring(str.length() - 2);
        for (int i = 0; i < str.length() - 2; i++) {
            String substring = str.substring(i, i + 2);
            if (substring.equals(lastTwo)) {
                count++;
            }
        }
        return count;
    }
}

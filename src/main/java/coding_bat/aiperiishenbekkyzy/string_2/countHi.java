package coding_bat.aiperiishenbekkyzy.string_2;

public class countHi {
    public int countHi(String str) {
        int len = str.length() - 1;
        int times = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i')
                times++;
        }
        return times;

    }
}

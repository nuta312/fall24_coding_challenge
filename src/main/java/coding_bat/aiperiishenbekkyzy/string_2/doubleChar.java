package coding_bat.aiperiishenbekkyzy.string_2;

public class doubleChar {
    public String doubleChar(String str) {
        int count = 0;
        int length = str.length();
        String doubled = "";
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(count);
            doubled += ch;
            doubled += ch;
            count++;
        }
        return doubled;
    }
}

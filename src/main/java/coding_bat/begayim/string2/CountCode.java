package coding_bat.begayim.string2;

public class CountCode {
    public int countCode(String str) {
        int codeCount = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            String sub = str.substring(i, i + 4);
            if (sub.startsWith("co") && sub.endsWith("e")) {
                codeCount++;
            }
        }
        return codeCount;
    }
}

package coding_bat.bermet.warmup2;

public class StringSplosion {
    public String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i <= str.length(); i++) {
            result += str.substring(0, i);
        }

        return result;
    }
}

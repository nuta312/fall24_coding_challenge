package coding_bat.aiza.warmup_2;

public class stringSplosion {
    public String stringSplosion(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.append(str.substring(0, i + 1));
        }
        return result.toString();
    }
}

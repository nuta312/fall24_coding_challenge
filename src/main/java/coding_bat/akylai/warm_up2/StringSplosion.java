package coding_bat.akylai.warm_up2;

public class StringSplosion {
    public String stringSplosion(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= str.length(); i++) {
            result.append(str.substring(0, i));
        }
        return result.toString();
    }
}

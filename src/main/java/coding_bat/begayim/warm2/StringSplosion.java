package coding_bat.begayim.warm2;

public class StringSplosion {
    public String stringSplosion(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.append(str.substring(0,i+1));
        }
        return result.toString();
    }
}

package coding_bat.Murat.Warmup2;

public class StringSplosion {
    public String stringSplosion(String str) {
        String newstr = "";
        int substring = 0;
        for (int i = 0; i < str.length(); i++) {
            newstr += str.substring(0, i + 1);
        }
        return newstr;
    }
}

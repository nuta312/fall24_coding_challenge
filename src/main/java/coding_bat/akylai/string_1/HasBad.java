package coding_bat.akylai.string_1;

public class HasBad {
    public boolean hasBad(String str) {
        return str.length() >= 3 && (str.startsWith("bad") || str.substring(1).startsWith("bad"));
    }
}

package coding_bat.begayim.string1;

public class EndsLy {
    public boolean endsLy(String str) {
        if (str.length() < 2) {
            return false;
        }
        return str.endsWith("ly");
    }
}

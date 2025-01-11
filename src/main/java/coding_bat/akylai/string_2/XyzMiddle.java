package coding_bat.akylai.string_2;

public class XyzMiddle {
    public boolean xyzMiddle(String str) {
        if(str.length() < 3)
            return false;
        int start1 = str.length() / 2 - 2;
        int start2 = str.length() / 2 - 1;

        if(str.length() % 2 == 0) {
            return str.startsWith("xyz", start1) ||
                    str.startsWith("xyz", start2);
        }
        return str.startsWith("xyz", start2);
    }
}

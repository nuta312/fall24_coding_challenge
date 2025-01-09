package coding_bat.rano.string2;

public class XyzThere {
    public boolean xyzThere(String str) {
        int index = str.indexOf("xyz");
        while (index != -1) {
            if (index == 0 || str.charAt(index - 1) != '.') {
                return true;
            }
            index = str.indexOf("xyz", index + 1);
        }
        return false;
    }
}

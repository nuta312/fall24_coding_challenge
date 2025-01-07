package coding_bat.delnura.string_1;

public class atFirst {
    public String atFirst(String str) {
        if (str.length() < 2) {

            if (str.length() == 1) {
                return str + "@";
            } else {
                return "@@";
            }
        }

        return str.substring(0, 2);
    }
}

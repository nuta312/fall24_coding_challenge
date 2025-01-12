package coding_bat.dastanA.string_1;

public class AtFirst {
    public String atFirst(String str) {
        if (str.length() == 1) {
            return str + '@';
        }
        if (str.length() < 1) {
            return "@@";
        }
        return str.substring(0,2);
    }
}

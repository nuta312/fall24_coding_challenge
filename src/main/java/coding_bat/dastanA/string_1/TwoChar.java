package coding_bat.dastanA.string_1;

public class TwoChar {
    public String twoChar(String str, int index) {
        if (index <= str.length()-2 && index >= 0) {
            return str.substring(index, index+2);
        }
        return str.substring(0, 2);
    }
}

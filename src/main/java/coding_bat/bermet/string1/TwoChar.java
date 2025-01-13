package coding_bat.bermet.string1;

public class TwoChar {
    public String twoChar(String str, int index) {
        if (str.length()-2 < index || index < 0){
            return str.substring(0,2);
        } else {
            return str.substring(index, index + 2);
        }
    }
}

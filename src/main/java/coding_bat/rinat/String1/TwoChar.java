package coding_bat.rinat.String1;

public class TwoChar {
    public String twoChar(String str, int index) {
        if (str.length() < 3){
            return str;
        } else {
            if (0 <= index && index< str.length()-1) {
                return str.substring(index, index + 2);
            } else {
                return str.substring(0,2);
            }
        }
    }

}

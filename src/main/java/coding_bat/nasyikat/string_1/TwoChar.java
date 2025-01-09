package coding_bat.nasyikat.string_1;

public class TwoChar {
    public String twoChar(String str, int index) {
        if (index < 0 || index + 2 > str.length()){ // false
            return str.substring(0,2);
        }
        return str.substring(index,index+2);
    }
}

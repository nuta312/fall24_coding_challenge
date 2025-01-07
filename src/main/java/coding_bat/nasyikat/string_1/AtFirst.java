package coding_bat.nasyikat.string_1;

public class AtFirst {
    public String atFirst(String str) {
        if (str.length() >= 2){
            return str.substring(0,2);
        }
        else {
            return (str + "@@").substring(0, 2);
        }
    }
}

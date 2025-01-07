package coding_bat.nasyikat.string_1;

public class WithouEnd2 {
    public String withouEnd2(String str) {
        if (str.length() <= 1) {
            return ("");
        }
        else if (str.length() > 1){
            return str.substring(1,str.length()-1) + str.substring(str.length());
        }
        return str;
    }
}

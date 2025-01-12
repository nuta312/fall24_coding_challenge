package coding_bat.akylai.string_1;

public class ExtraEnd {
    public String extraEnd(String str) {
        String lastTwo = str.substring(str.length() - 2);
        if (str.length() == 2){
            return str + str + str;
        } else if (str.length() > 2) {
            return lastTwo + lastTwo + lastTwo;
        } else {
            return str;
        }
    }
}

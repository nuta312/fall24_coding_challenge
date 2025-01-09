package coding_bat.begayim.string1;

public class ExtraEnd {
    public String extraEnd(String str) {
        String str2 = str.substring(str.length()-2);
        return (str2+str2+str2);
    }
}
